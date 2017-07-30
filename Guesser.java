//This program guesses a number from 1-1000 in 10 tries or less.
import java.util.*;
public class Guesser {
	public static void main(String[] args) {
//The boundries from 0-1001(exclusive) are set.
   	int guess = 500;
      int minlimit = 0;
      int maxlimit = 1001;
		int numofguess = 0;
      String gorl;
      System.out.println("Think of a number from 1-1000");
//This asks the user if their number is greater or less than a number displayed.
//It then counts the tries it takes to guess the number between 1-1000.
      do {
         System.out.println("Is your number greater (type g) or less than (type l) "+guess+"?");
         Scanner console = new Scanner (System.in);
         gorl = console.next();
         if (gorl.equals("l")) {
            maxlimit = guess;
         } else if (gorl.equals("g")) {
            minlimit = guess;
         }
         guess = guesser(maxlimit, minlimit);
         numofguess++;
         if (gorl.equals("y")) {
            System.out.println("Thanks for playing! It took "+numofguess+" tries to guess your number: "+guess);
         }
      } while (gorl.equals("g") || gorl.equals("l"));

   }
	public static int guesser(int maxlimit, int minlimit){
//This method returns a value that is the median of the guessed min and max limit.
   	int guess = (maxlimit-minlimit)/2+minlimit;
      return guess;
	}
}
