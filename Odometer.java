//This program finds the distance traveled on an odometer and outputs the cost of travel per mile.
import java.util.*;
public class Odometer {
   public static void main(String[] args) {
//The following prompts the user to input the initial milage on the odometer.
//It then saves it as a double.
         Scanner console = new Scanner (System.in);
         System.out.print("Enter beginning odometer reading: ");
         double x = console.nextDouble();
//The following prompts the user to input the final milage on the odometer.
//It then saves it as a double.
         System.out.print("Enter ending odometer reading: ");
         double y = console.nextDouble();
//The distance traveled is calculated and saved as a variable.
         double z = y-x;
//The distance traveled, rounded to the nearest 10th, and the cost,
//is rounded to the nearest 100th, and is printed on the screen.
         System.out.printf ("You traveled "+"%.1f", z);
         System.out.println (" miles. At $.35 per mile,");
         System.out.printf ("Your reimbursement is $"+"%.2f", z*.35);
         System.out.println();
   }
}
