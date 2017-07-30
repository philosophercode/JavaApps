//This program changes words into pig latin.
import java.util.*;
public class Piglatin {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
//Prompts the user to input thier first and last names then saves them as Strings 'first' and 'last' and then writes them in lowercase.
      System.out.print("Enter your first name: ");
   	String first = console.next();
		first = first.toLowerCase();
		System.out.print("Enter your last name: ");
   	String last = console.next();
   	last = last.toLowerCase();
//The first letter of the first and last names are isolated as Strings.
		String firstletterf = first.substring(0,1);
   	String firstname = pigLatinFirstLetter(first);
   	String firstletterl = last.substring(0,1);
		String lastname = pigLatinFirstLetter(last);
//The names are printed on the screen. The first letters are capitalized.
//The inital first letter is placed at the end of the name and an "ay" is appended.
   	System.out.println(firstname.substring(0,1).toUpperCase()+firstname.substring(1)+firstletterf+"ay "+lastname.substring(0,1).toUpperCase()+lastname.substring(1)+firstletterl+"ay");
   }
	public static String pigLatinFirstLetter(String name){
//All the letters from the first and last names except for the first letter are saved as Strings.
   	int a;
   	a = name.length();
		String allbutfirstchar = name.substring (1);
   	return allbutfirstchar;
   }
}
