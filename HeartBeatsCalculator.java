/*
11/13/2022
@author owebb

According to healthline.com, a normal resting heart rate is between 60 and 100 beats per minute.
It means that the average of heart rate is 80 per minute.
 */
package ow.calculations;

import java.util.*;
public class HeartBeatsCalculator {
  public static void main(String[] args) {
      int totalBeats;
      int averageBitsPerMin = 80;
      int ageInYears;
      int ageInDays;
      int ageInMinutes;
      Scanner inputDevice = new Scanner(System.in);
 
      System.out.print("Enter your age in years: ");
      ageInYears = inputDevice.nextInt();
      
      ageInDays = ageInYears * 365;  // Calculate days without leap years
      ageInDays += (ageInYears / 4); // Add days for leap years
   
      System.out.println("Your age is " + ageInDays + ".");
   
      ageInMinutes = ageInDays * 24 * 60;         // 24 hours/day, 60 minutes/hour
      System.out.println("You are " + ageInMinutes + " minutes old.");

      totalBeats = ageInMinutes * averageBitsPerMin;
      System.out.println("Your heart has beat " + totalBeats + " times in your life time."); 
  }
}
