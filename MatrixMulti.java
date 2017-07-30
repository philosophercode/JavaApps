//This program prompts the user to input 2 matrices. These 2 matrices are multiplied and output into a new matrix. All 3 are then printed out.
import java.util.*;
import java.util.Arrays;
public class MatrixMulti {
	public static void main(String[] args) {
//The user is asked the height and width of the two matrices and the values inside them.
    	int num=0;
    	int row=0;
    	int col=0;
    	Scanner console = new Scanner (System.in);
		System.out.println("Enter the number of rows (1st matrix):");
		int height1 = console.nextInt();
		System.out.println("Enter the number of columns (1st matrix):");
		int width1 = console.nextInt();
		int[][] matrix1 = new int[height1][width1];


		for (row=0; row<height1; row++) {
			for (col=0; col<width1; col++) {
				System.out.println("Enter number (row, column) ["+row+", "+col+"]");
				matrix1[row][col] = console.nextInt();
			}
		}

		System.out.println("The number of rows of the 2nd matrix is the same number as the columns in 1st matrix in order to multiply: "+width1);
		int height2 = width1;
		System.out.println("Enter the number of columns (2nd matrix):");
		int width2 = console.nextInt();
		int[][] matrix2 = new int[height2][width2];


		for (row=0; row<height2; row++) {
			for (col=0; col<width2; col++) {
				System.out.println("Enter number (row, column) ["+row+", "+col+"]");
				matrix2[row][col] = console.nextInt();
			}
		}

		multiplier(matrix1, height1, width1, matrix2, height2, width2);
	}
	public static void multiplier(int [][] matrix1, int height1, int width1, int [][] matrix2, int height2, int width2){
		int [][] matrix1x2 = new int[height1][width2];
//The 1st matrix is traversed by colomn across the same row and the 2nd by row across the same column. They are multiplied and added and incremented to the multiplied matrix.
		for (int row1=0; row1<height1; row1++) {
			for (int col2=0; col2<width2; col2++) {
				for (int col1=0; col1<width1; col1++) {
					matrix1x2[row1][col2]=matrix1x2[row1][col2]+matrix1[row1][col1]*matrix2[col1][col2];
				}
			}
		}
//The matrices are printed out.
		System.out.println("Matrix 1: ["+height1+"x"+width1+"]: ");
		System.out.println(Arrays.deepToString(matrix1));
		System.out.println("Matrix 2: ["+height2+"x"+width2+"]: ");
		System.out.println(Arrays.deepToString(matrix2));
		System.out.println("Matrix 1*2 ["+height1+"x"+width2+"]: ");
		System.out.println(Arrays.deepToString(matrix1x2));

	}
}
