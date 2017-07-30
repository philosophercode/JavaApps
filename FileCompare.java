//This program compares the text of two files by line and show the discrepancies.
import java.util.*;
import java.io.*;
public class FileCompare{
	public static void main(String[] args) throws FileNotFoundException {
//Prompts the user to enter the name of the two files
		Scanner console = new Scanner(System.in);
		System.out.println("Type file 1 name:");
		String filename1 = console.next();
		File file1 = new File(filename1);
		Scanner input1 = new Scanner(file1);
		System.out.println("Type file 2 name:");
		String filename2 = console.next();
		File file2 = new File(filename2);
		Scanner input2 = new Scanner(file2);
		compare(input1, input2);
	}
	public static void compare(Scanner input1, Scanner input2){
		int linecount = 0;
		int wordcount = 0;
		int charcount = 0;
//This compares the line of one file against another.
//If the lines differ, the two lines are shown together
//and the line they are on is noted.
		while (input1.hasNextLine()) {
			String lineof1 = input1.nextLine();
			String lineof2 = input2.nextLine();
			linecount++;
			if (!lineof1.equals(lineof2)) {
				System.out.println("Difference Found: ");
				System.out.println("Line "+linecount);
				System.out.println("< "+lineof1);
				System.out.println("> "+lineof2);
			}
		}
	}
}
