/*
11/11/2022
@author owebb
 */
package ow.calculations;

public class Percentages {
    public static void main (String args[]) {
        computePercent(8.0, 20.0);
    }
    public static void computePercent(double num1, double num2) {
        double percentage1;
        double percentage2;
        percentage1 = num1 / num2 * 100.0;
        percentage2 = num2 / num1 * 100.0;

        System.out.println("Number 1 is " + num1 + " and Number 2 is " + num2 + ":");
        System.out.println(num1 + " is " + percentage1 + " percent of " + num2);
        System.out.println(num2 + " is " + percentage2 + " percent of " + num1);
        System.out.println("***************");
    }
}