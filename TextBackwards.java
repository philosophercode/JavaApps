//This program takes in text and outputs the text backwards.
import java.util.*;
public class TextBackwards {
	public static void main(String[] args) {
//The user is prompted to enter text which is saved as a string variable.
		Scanner console = new Scanner (System.in);
		System.out.print("Enter text: ");
   		String text = console.nextLine();
   		backwards(text);
   		System.out.println();
	}
	public static void backwards(String text){
//The text is printed on the screen with the text inputed backwards.
		int textlength = text.length();
		for (int i = 1; i<=textlength; i++) {
			System.out.print(text.charAt(textlength-i));
		}
	}
}
