//This program counts and displays the number of lines, words, and characters in a file.
import java.util.*;
import java.io.*;
public class TextFileStats {
	public static void main(String[] args) throws FileNotFoundException {
//Prompts user to input a file name to scan
		Scanner console = new Scanner(System.in);
		System.out.println("Type file name:");
		String filename = console.next();
		File file = new File(filename);
		Scanner input = new Scanner(file);
		indenter(input);
	}
	public static void indenter(Scanner input){
		int linecount = 0;
		int wordcount = 0;
		int charcount = 0;
//This breaks up the text by line and counts the lines
		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineScanner = new Scanner(line);
			linecount++;
//This breaks up the lines by words and counts the word and charachter length
			while (lineScanner.hasNext()) {
			    String word = lineScanner.next();
				wordcount++;
				charcount += word.length();
			}
		}
//This prints out the number of lines, words, and characters
		System.out.println("File has:");
		System.out.println("Lines: "+linecount);
		System.out.println("Words: "+wordcount);
		System.out.println("Characters: "+charcount);
	}
}
