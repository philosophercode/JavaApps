//This program adds the preceding even number, starting at 2, and prints it on a line until 30.
public class EvenPrint {
	public static void main(String[] args) {
//The inital intergers are assigned to variables.
    	int k = 2;
    	int l = 2;
    	even(k, l);
    }
//This method uses the initalized intergers to print out line by line the even numbers added to the preceding number until 30.
    public static void even(int k, int l) {
        for (int counter=0; k<30;  counter=k) {
            System.out.println(k);
            k = k+l;
            l = k-l;
    	}
    	System.out.println();
    }
}
