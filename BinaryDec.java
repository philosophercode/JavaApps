//This program converts a 4-bit binary number into a decimal number.
import java.util.*;
public class BinaryDec {
   public static void main(String[] args) {
//The following prompts the user to input a 4-bit binary number. The number is saved
//as a text string.
         Scanner console = new Scanner (System.in);
         System.out.print("Enter a four-bit binary number: ");
         String x = console.next();
//The string is broken into its individual constitutive characters and assigned as
//variables as intergers either 0 or 1.
         int a = x.charAt (0);
         int b = x.charAt (1);
         int c = x.charAt (2);
         int d = x.charAt (3);
//The intergers are pluged into the following formula which converts binary to decimal.
//the product is assigned to the variable 'decimal'.
         int decimal = (a*8)+(b*4)+(c*2)+d;
//The value of the decimal number is printed on the screen.
         System.out.println("Binary-->Decimal: "+(decimal-720));
    }
}
