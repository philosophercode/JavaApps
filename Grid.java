//This program prints a user defined grid.
import java.util.*;
public class Grid {
	public static void main(String[] args) {
//The following prompts the user to input the amount of columns and rows to be displayed.
    	Scanner console = new Scanner (System.in);
    	System.out.print("Rows: ");
    	int rows = console.nextInt();
	    System.out.print("Columns: ");
    	int columns = console.nextInt();
//This for loop prints a grid with consecutive numbers ascending by column.
    	for (int a = 1; a <= rows; a++){
    		for(int b = a; b <= (rows*columns); b=b+rows){
    			System.out.printf("%-5d", b);
    		}
    		System.out.println();
    	}
    }
}
