//This program takes a non-indented java file, indents it based on the bracketing "{}" and saves it as a new file
import java.util.*;
import java.io.*;
public class Indenter {
	public static void main(String[] args) throws FileNotFoundException {
//Prompts a user to input a file name, loads the file and creates a new one named "output.java"
		Scanner console = new Scanner(System.in);
		System.out.println("Type file name:");
		String filename = console.next();
		File file = new File(filename);
		Scanner input = new Scanner(file);
		PrintStream output = new PrintStream(new File("output.java"));
		counter(input, output);
	}
	public static void counter(Scanner input, PrintStream output){
		int numofindent = 0;
		String indentation= "";
		String indent = "    ";
//This breaks up the file by line.
		while (input.hasNextLine()) {
			String line = input.nextLine();
			Scanner lineScanner = new Scanner(line);

//This breaks up the line by word.
//If there is a "{" then the following lines are indented.
//If there is a "}" then that line and the following are decreased by an indentation.
//Each edited line is written to the file "output.java" and the user is notified.
			while (lineScanner.hasNext()) {
			    String word = lineScanner.next();
			    if (word.equals("{")) {
			    	output.println(indentation+line);
			    	line = input.nextLine();
			    	lineScanner = new Scanner(line);
			    	indentation = indentation+indent;
			    	numofindent++;
			    }
			    if (word.equals("}")) {
			    	indentation= "";
			    	numofindent--;
			    	for (int i=0; i<numofindent; i++) {
			    		indentation=indentation+indent;
			    	}
			    }
			}

			output.println(indentation+line);

		}
		System.out.println("Indented file has been saved to current directory as \"output.java\"");
	}
}
