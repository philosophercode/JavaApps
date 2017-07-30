//This program calculates and displayes 1! to 5!.
public class Factorial {
	public static void main(String[] args){
//Starting at 1 and ending at 5, the factorial is calculated then saved as a variable, printed on the screen,
//and the reentered into the formula so the next factorial can be calculated.
    	int j=1;
        for (int i = 1 ; i <= 5; i++) {
            j=i*j;
            System.out.println(i+"! = "+j);
    	}
    }
}
