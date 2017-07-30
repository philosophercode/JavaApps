//This program creates an image.
public class TextImage {
	public static void main(String[] args) {
//This for loop builds a 6 row image calling methods to produce each row.
		for (int rows=1; rows<=6; rows++) {
			stars(rows);
			spaces(rows);
			frwdslash(rows);
			backslash(rows);
			spaces(rows);
			stars(rows);
			System.out.println();
		}
	}
//This method prints 5 "*" in the first line and one less on every consecutive row.
	public static void stars(int rows){
		for (int star=1; star<=-1*rows+6;star++) {
			System.out.print("*");
		}
	}
//This method prints 1 space in the first line and one more on every consecutive row.
	public static void spaces(int rows){
		for (int spaces=1; spaces<=rows;spaces++) {
			System.out.print(" ");
		}
	}
	public static void frwdslash(int rows){
//This method prints 10 "/" in the first line and two less on every consecutive row.
		for (int frwdslash=1; frwdslash<=-2*rows+12;frwdslash=frwdslash+1) {
			System.out.print("/");
		}
	}
	public static void backslash(int rows){
//This method prints 0 "/" in the first line, 2 on the second row, and two more on every consecutive row.
		for (int backslash=9; backslash>=-2*rows+12;backslash--) {
			System.out.print("\\");
		}
	}
}
