
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author viole
 */
public class WindowMaster {
        public static void main(String[] args){
        
        // declare variables
        float height = 0f;
        float width = 0f;

        float area;
        float perimeter;

        final float glassPrice = 3.50f;
        final float trimPrice = 2.25f;
        float cost;
        
        // prompt user and get inputs
        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the height of the window in feet:");
        height = in.nextFloat();
        System.out.println("Please provide the width of the window in feet:");
        width = in.nextFloat();
        
        // calculate area and perimeter
        area = height * width;
        perimeter = height + width + width + height;
        
        // display area and perimeter
        System.out.println("The area of the window is: " + area + " square feet.");
        System.out.println("The perimeter of the window is: " + perimeter + " feet.");
        
        // calculate costs
        cost = glassPrice * area + trimPrice * perimeter;
        System.out.println("The total cost of the window is estimated to be: $" + cost);
        
        }
        
    
}
