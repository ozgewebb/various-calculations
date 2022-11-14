/*
11/11/2022
@author owebb
 */
package ow.calculations;

import java.util.Scanner;
public class CalculatorForPaintingWalls {
    public static void main (String args[]) {
        double length;
        double width;
        double height;
        double area;
        double gallonsNeedForArea;
        final double PRICE_FOR_PER_GALLON = 32.0;
        double priceForArea;     
        Scanner inputDevice = new Scanner(System.in);       
        System.out.print("length >> ");
        length = inputDevice.nextDouble();
        System.out.print("width >> ");
        width = inputDevice.nextDouble();
        System.out.print("height >> ");
        height = inputDevice.nextDouble();       
        area = computeArea(length, width, height);
        gallonsNeedForArea  = computeGallons(area);
        priceForArea = gallonsNeedForArea * PRICE_FOR_PER_GALLON;
        System.out.println("You will need "  + gallonsNeedForArea + " gallons");
        System.out.println("The price to paint the room is $" + priceForArea);
    }
    public static double computeArea(double length, double width, double height) {
        double area;
        area = 2 * (length + width) * height;
        return area;
    }
    public static double computeGallons(double area) {
        double gallonsNeedForArea;
        final double sqFeetForPerGallon = 350;
        gallonsNeedForArea = area / sqFeetForPerGallon;
        if (area % sqFeetForPerGallon == 0) {
            return gallonsNeedForArea;
        }
        else {
            return gallonsNeedForArea + 1;
            // +1 is for "any fraction of a gallon of paint at the same price as a whole gallon"
        }
    }
}

/*
The area A of four walls of a room of length, width (breadth) and height is given by the formula 
Area = 2 * (length + width) * height
*/


