//This program loads "names.txt" scans it for a user inputed name and prints out the
//rank of that name in popularity by year.
import java.util.*;
import java.io.*;
public class Namer{
	public static void main(String[] args) throws FileNotFoundException {
//Loads names.txt and prompts user to enter name.
		System.out.println("This program allows you to search through the");
		System.out.println("data from the Social Security Administration");
		System.out.println("to see how popular a particular name has been");
		System.out.println("since 1900.");
		Scanner console = new Scanner(System.in);
		File file = new File("names.txt");
		Scanner input = new Scanner(file);
		System.out.println();
		System.out.println("Type name to search [Capitalize 1st letter]:");
		String name = console.next();
		namer(input, name);
	}
	public static void namer(Scanner input, String name){
		int year=1900;
		int pop=0;
//This breaks up the file by line.
		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineScanner = new Scanner(line);
//This breaks up the line by word.
			while (lineScanner.hasNext()) {
			    String word = lineScanner.next();
//If the word on a line matches the name inputted
//then the ranks in popularity listed after the name
//are displayed by decade starting with 1900.
				if (word.equals(name)) {
					System.out.println("Statistics on name \""+name+"\"");
					while (lineScanner.hasNextInt()){
						pop=lineScanner.nextInt();
						System.out.println(year+": "+pop);
						year+=10;
					}
				}

			}
		}
	}
}
