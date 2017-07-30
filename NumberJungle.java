//This program manipulates a user entered number and prints out the manipulations.
import java.util.*;
public class NumberJungle {
	public static void main(String[] args) {
//The user is prompted to enter a number.
		Scanner console = new Scanner (System.in);
		System.out.print("Enter number: ");
   		int number = console.nextInt();
//If the number entered is less than 1, "ERROR" is printed on the screen and the program is exited.
   		if (number<1) {
   			System.out.println("ERROR");
   		}
		int counter = 1;
//This for loop counts the times the number is manipulated and prints out the manipulation and the count.
		for (int i = 0; i<=counter; i++) {
			counter++;
			if (number==1) {
				counter-=2;
				System.out.println("Final value 1, number of operations performed "+counter);
			} else if (number%2==0) {
				number = number/2;
				System.out.println("Next value is: "+number);
			} else if (number%2==1) {
				number = number*3+1;
				System.out.println("Next value is: "+number);
			}
		}
	}
}
