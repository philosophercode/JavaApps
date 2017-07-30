//This program plays the game Rock, Paper, Scissor (R.P.S).
//The user can choose 1 of 3 different variations that the computer uses to choose R.P.S.
import java.util.*;
public class RPSGame {
	public static void main(String[] args) {
//The inital variables are declared.
		Random rand = new Random();
      int comprps = rand.nextInt(3)+1;
      int gametype = 4;
//While the exit code ("0") is not entered the game is continually played.
//The user is asked how the computer will choose R.P.S.
//The user is then asked to enter R.P.S.
      do{
         Scanner console = new Scanner (System.in);
         System.out.println("Do you want to play randomly, patterned, or with my smarts? (Type 1, 2, or 3 respectively)");
         gametype = console.nextInt();
         System.out.println("Rock, paper, or scissors? (Type 1, 2, or 3 respectively)");
         int rps = console.nextInt();
         if (gametype==1) {
            comprps = rando();
         }
         if (gametype==2) {
            comprps = patterned();
         }
         comprps = winner (comprps, rps);
         System.out.println();
         System.out.println("To continue playing type '4' to exit type '0' ");
         gametype = console.nextInt();
         System.out.println();
      } while (gametype!=0);

   }
   public static int rando(){
//This method makes the computer choose a random R.P.S.
   	Random rand = new Random();
   	int comprps = rand.nextInt(3)+1;
   	return comprps;
   }
   public static int patterned(){
//This method makes the computer always choose rock.
      int comprps = 1;
      return comprps;
   }
   public static int winner (int comprps, int rps){
//This method evaluates the winner and then saves the winner's choice as the computers (for use during the next round in the 'smarts variation').
//If it is a tie the computer is assigned a random R.P.S.
      Random rand = new Random();
      String win = "win.";
      String lose = "lose.";
      String tie = "Its a tie.";
      if (comprps==1) {
         System.out.println("I choose rock.");
      }
      if (comprps==2) {
         System.out.println("I choose paper.");
      }
      if (comprps==3) {
         System.out.println("I choose scissors.");
      }
      if (comprps==rps) {
         System.out.println(tie);
         comprps = rand.nextInt(3)+1;
         return comprps;
      }
      if (comprps==2 && rps==3) {
         System.out.println("You "+win);
         comprps = rps;
      }
      if (comprps==2 && rps==1) {
         System.out.println("I "+win);
      }
      if (comprps==3 && rps==2) {
         System.out.println("I "+win);
      }
      if (comprps==3 && rps==1) {
         System.out.println("You "+win);
         comprps = rps;
      }
      if (comprps==1 && rps==3) {
         System.out.println("I "+win);
      }
      if (comprps==1 && rps==2) {
         System.out.println("You "+win);
         comprps = rps;
      }
      return comprps;
   }
}
