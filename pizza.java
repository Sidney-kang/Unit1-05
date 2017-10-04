/****************************************************************************
 *
 * Created on : 26 Sept. 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit1-05
 * # This program calculates the cost of a pizza with the diameter inputed by user
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.*;

public class pizza 
{

    //constants
    static double LABOUR_COST = 0.75;
    static double RENT_COST = 1.00;
    static double MATERIALS_COST = 0.50;
    static double HST = 1.13;


    static double CalculatePizzaCost(double pizzaSize)
    {
        double total_cost = (LABOUR_COST + RENT_COST + 
                                        (MATERIALS_COST * pizzaSize) ) * HST;                                   
        return total_cost;            
    }
  
    public static void main(String[] args)
    {
        double pizzaSize;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the diameter of the pizza in inches:");
      
       try 
       {
             pizzaSize = Double.parseDouble(br.readLine());            
             System.out.println("Your pizza size is: " + pizzaSize);
            
             double pizzaCost = CalculatePizzaCost(pizzaSize);
             pizzaCost = Math.round(pizzaCost*100)/100D;
             System.out.println("Your pizza cost $" + pizzaCost);
        } 
        catch(Exception nfe) 
        {
            System.err.println("Invalid input!");
        }  
    }
}
