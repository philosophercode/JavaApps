//This program calculates and displays the Fibonacci sequence up until a specified number of numbers.
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
//The user is prompted to enter how many numbers of Fibonacci are to be displayed.
        Scanner console = new Scanner (System.in);
		System.out.print("Number of Fibonacci #s: ");
    	int counter = console.nextInt();
    	int k = 0;
    	int l = 1;
    	fibonacci(counter, k, l);
    }
    public static void fibonacci(int counter, int k, int l) {
//Fibonacci is calculated in this for loop, which is repeated until the number of times that the user entered.
        for (int i=0; i<counter; i++) {
            System.out.print(k+" ");
            k = k+l;
            l = k-l;
    	}
    	System.out.println();
    }
}
