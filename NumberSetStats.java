//This program evaluates the mean, min, max, sum, median, mode, and standard deviation of a set of 10 numbers.
import java.util.*;
public class NumberSetStats {
	public static void main(String[] args) {
//The user is prompted to enter 10 intergers.
    	Scanner console = new Scanner (System.in);
    	int[] num = new int[10];
    	int a = 1;
		int number=0;
		System.out.println("Please enter 10 integers separated by spaces:");
		for (int i=0; i<10; i++) {
			System.out.println("Integer "+a+":");
			num[i] = console.nextInt();
			a++;
		}

		num=sorter(num);
		math(num);
	}
	public static int[] sorter (int[] num){
	 	//This is a bubble sort that reorders the array from smallest to largest number.
	 	int didswap = 1;
	 	int temp = 0;
   		while (didswap == 1) {
			didswap = 0;
			for (int i = 0; i < num.length-1; i++) {
		        if (num[i] > num[i+1]) {
		            temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
					didswap = 1;
				}
			}
		}
		return num;
	}
	public static void math (int[] num){
		//Min and max are the extremes of the array after it has been bubble sorted and median is the middle one.
		int min=num[0];
		int max=num[9];
		int median=num[5];
		int sum=0;
		double mean=0;
		int mode=0;
		double standev=0;
		double total=0;
		int bestindex=0;
		int bestnum=0;
//mean
		for (int i=0; i<=9; i++) {
			total=total+num[i];
			if (i==9) {
				mean=total/10;
			}
		}

//mode
//A number is counted by how many times it appears in the array. The number that appears most is then saved.
		for (int i=0; i<9; i++) {
			int number1=num[i];
			int index=0;
			for (int j=0; j<9; j++) {
				int number2=num[j+1];
				if (number1==number2) {
					index++;
					if (index>bestindex){
					bestnum=number1;
					bestindex=index;
					}
				}
			}
		}
//standard deviation
		for (int i=0; i<10; i++) {
			double a=Math.pow((mean-num[i]),2);
			standev=standev+a;
		}
		standev= Math.sqrt(standev/9);
//sum
		sum = (int) total;
//Printout of the evaluated above.
		System.out.println("Mean: "+mean);
		System.out.println("Min: "+min);
		System.out.println("Max: "+max);
		System.out.println("Sum: "+sum);
		System.out.println("Median: "+median);
		System.out.println("Mode: "+bestnum);
		System.out.println("Standard Deviation: "+standev);
	}
}
