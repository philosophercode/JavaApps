//This program calculates the quadrant that a coordinate is on a cartesian grid.
import java.util.*;
public class CartesianQuadrant {
	public static void main(String[] args) {
//The user is prompted to enter coordinates.
    	Scanner console = new Scanner (System.in);
    	System.out.print("X: ");
    	double x = console.nextDouble();
    	System.out.print("Y: ");
    	double y = console.nextDouble();
        double quadrant = quadrantCalc(x, y);
//This prints out where the coordinates are located if not inside a quadrant.
        System.out.print("("+x+", "+y+") is");
    	if ((x==0) && (y==0)){
    		System.out.print(" at the origin.");
    	}
    	else if (y==0){
    		System.out.print(" on the X axis.");
    	}
    	else if (x==0){
    		System.out.print(" on the Y axis.");
    	}
//This prints out the which quadrant the coordinates are in.
    	else {
    		System.out.printf(" in the quadrant %.0f", quadrant);
    	}
    	System.out.println();
    }
//This calculates which quadrant the coordinates are in.
    public static double quadrantCalc(double x, double y){
    	int quadrant = 0;
    	if ((x>0) && (y>0)) {
    		quadrant = 1;
    	}
    	if ((x<0) && (y>0)) {
    		quadrant = 2;
    	}
    	if ((x<0) && (y<0)) {
    		quadrant = 3;
    	}
    	if ((x>0) && (y<0)) {
    		quadrant = 4;
    	}
    	return quadrant;
    }
}
