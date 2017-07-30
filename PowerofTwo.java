//This program calculates the power of 2 up to a user inputed number.
import java.util.*;
public class PowerofTwo {
	public static void main(String[] args){
//Prompts the user to input a number and saves it as a variable.
		Scanner console = new Scanner (System.in);
    	System.out.print("Enter number: ");
    	int number = console.nextInt();
//This For loop prints the method as many times as the number that was entered.
        for (int i=0; i < number; i++) {
            System.out.println(powermath(i));
        }
    }
    public static int powermath(int number){
//This for loop calculates the power of 2 starting at 0.
//The value is returned into the main method.
        int k = 1;
        for(int j = 0; j < number; j++) {
            k = k * 2;
    	}
        return k;
    }
}
