#Created by : Sidney Kang
#Created on : 26 Sept. 2017
#Created for : ICS3UR
# Daily Assignment - Unit1-05
# This program calculates the cost of a pizza with the diameter inputed by user

import ui

def calculate_pizza_price_touch_up_inside(sender):
    #This calculates the price of the pizza
    
    #constants
    Pi = 3.14
    labour_cost = 0.75
    rent_cost = 1.00
    materials_cost = 0.50
    HST = 1.13
    
    #input
    diameter = float(view['diameter_textbox'].text)
    
    #process
    total_cost = (labour_cost+rent_cost+materials_cost*diameter)*HST
    
    #output
    view['price_of_pizza_label'].text = "The cost is : "+"${:,.2f}".format(total_cost)
    
view = ui.load_view()
view.present('full_screen')
