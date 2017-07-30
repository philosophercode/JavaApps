//This program tells how many coins are returned after a purchased item is vended.
import java.util.*;
public class Vender {
   public static void main(String[] args) {
//The following prompts the user to input a price of an item to be vended.
   		Scanner console = new Scanner (System.in);
   		System.out.print("Enter price of item (from 25 cents to a dollar, in 5-cents increments):");
   		int a = console.nextInt();
//The change to be returned is assigned to a variable.
//Another variable is assigned to the amount of nickles in change.
         int r = 100-a;
         int c = r / 5;
   		int q=0;
   		int d=0;
   		int n;
//The following loop starts with the total nickles to be changed.
//If there is more than 5 nickles, a quater is tallyed. Until there are less than 5 nickels.
//If there is more than 2 nickles, a dime is tallyed. Until there are less than 2 nickels.
//The remaining nickles (1 or 0) are assigned to variable 'n'.
   		for (c=c; c>=5; q++) {
   			c=c-5;
   		}
   		for (c=c; c>=2; d++) {
   			c=c-2;
   		}
   		n=c;
//The price of the item, the total change, and the amount of quaters, dimes, and nickles returned,
//are printed on the screen.
   		System.out.println ("You bought an item for "+a+" cents and paid a dollar, so your change is:");
   		System.out.println (r+" cents");
   		System.out.println ("OR");
   		System.out.println ("Quarters: "+q);
   		System.out.println ("Dimes: "+d);
   		System.out.println ("Nickels: "+n);
	}
}
