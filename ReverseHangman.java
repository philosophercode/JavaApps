//This program plays 'reverse hangman' and generates random letters until a word matching the entered word is composed.
import java.util.*;
public class ReverseHangman {
	public static void main(String[] args) {
//The user is asked to input a word.
//A blank word the same length as the word entered is generated with underscores.
    	Scanner console = new Scanner (System.in);
		System.out.println("Please enter a word for me to guess(letters only):");
		String word = console.next();
		int wordlength = word.length();
		char blank = (char) 95;
		String workingword="";
		for (int i=0; i<=wordlength-1; i++){
			workingword = workingword+blank;
		}
		worder(word, workingword, wordlength);
	}
//This method generates a random letter then evaluates if the letter is in the given word.
//if the letter is in the word  is replaces an underscore with the letter.
//This is done until the guessed word is the same as the word entered.
	public static void worder(String word, String workingword, int wordlength) {
		do {
			Random rand = new Random();
	   		int letternum = rand.nextInt(26)+97;
	   		char randomletter = (char) letternum;
	   		String letter = randomletter+"";
			System.out.println();
			for (int i=0; i<=wordlength-1; i++) {
				if (word.charAt(i) == randomletter) {
					workingword = workingword.substring(0,i)+letter+workingword.substring(i+1,wordlength);
				}
			}
			System.out.print("My guess: "+letter+"	Current status: "+workingword);
			System.out.println();
		} while (!word.equals(workingword));

	}
}
