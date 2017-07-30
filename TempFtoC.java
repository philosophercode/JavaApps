//This program converts Fahrenheit into Celsius.
import java.util.*;
public class TempFtoC {
   public static void main(String[] args) {
//The following prompts the user to input a temperature in Fahrenheit and assigns it to a variable.
   		Scanner console = new Scanner (System.in);
   		System.out.print("Enter a temperature in Fahrenheit: ");
   		double f = console.nextInt();
//The temp. is input into the formula to convert Fahrenheit into Celsius.
		   double c;
   		c = 5*(f-32)/9;
//The converted temp. is printed on the screen.
   		System.out.println (f + " Fahrenheit is ");
   		System.out.printf ("%.1f", c);
   		System.out.print (" degrees Celsius.");
   		System.out.println();
	}
}
