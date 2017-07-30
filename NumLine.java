//This program takes a 4-digit number and prints each digit on its own line consecutively.
import java.util.*;
public class NumLine {
   public static void main(String[] args) {
////The following prompts the user to input a 4-digit number. The number is assigned to a variable.
   		Scanner console = new Scanner (System.in);
   		System.out.print("Enter a 4-digit number: ");
   		double fourdigit = console.nextInt();
//Each digit is converted into an individual number.
   		int digit1 = (int) (fourdigit/1000);
         int digit2 = (int) ((fourdigit%1000)/100);
         int digit3 = (int) ((fourdigit%100)/10);
         int digit4 = (int) (fourdigit%10);
//The digits are printed seperatly on seperate lines.
   		System.out.println (digit1);
   		System.out.println (digit2);
   		System.out.println (digit3);
   		System.out.println (digit4);
	}
}
