package ArrayExamples;
/* import java.util.Scanner;

public class MatrixMultiplicationArray{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the No.of Row in first matrix: ");
		int firstRow = sc.nextInt();
		System.out.println("Enter the No.of Column in first matrix: ");
		int firstColumn = sc.nextInt();
		
		int firstMatrix[][] = new int[firstRow][firstColumn];
		
		System.out.println("Enter elements of First matrix");
		
		for(int i = 0; i<firstRow; i++) {
			for(int j = 0; j<firstColumn; j++) {
				firstMatrix[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the No.of Row in second matrix: ");
		int secondRow = sc.nextInt();
		System.out.println("Enter the No.of Column in second matrix: ");
		int secondColumn = sc.nextInt();
		
		int secondMatrix[][] = new int[secondRow][secondColumn];
		
		System.out.println("Enter elements of Second matrix");
		
		for(int i = 0; i<secondRow; i++) {
			for(int j = 0; j<secondColumn; j++) {
				secondMatrix[i][j] = sc.nextInt();
			}
		}
		
	}
} */
/*
import java.util.Scanner;

class MatrixMultiplicationArray {
	public static void main(String args[]) {
		int firstRow, firstColumn, secondRow, secondColumn, sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows in first matrix");
		firstRow = in.nextInt();
		System.out.println("Enter the number of columns in first matrix");
		firstColumn = in.nextInt();
		
		int first[][] = new int[firstRow][firstColumn];
		System.out.println("Enter elements of first matrix");
		for (int i = 0; i < firstRow; i++) {
			for (int j = 0; j < firstColumn; j++) {
				first[i][j] = in.nextInt();
			}
		}
		
		System.out.println("Enter the number of rows in second matrix");
		secondRow = in.nextInt();
		System.out.println("Enter the number of columns in second matrix");
		secondColumn = in.nextInt();
		
		if (firstColumn != secondRow) {
			System.out.println("The matrices can't be multiplied with each other.");
		}
		else {
			int second[][] = new int[secondRow][secondColumn];
			int multiply[][] = new int[firstRow][secondColumn];
			
			System.out.println("Enter elements of second matrix");
			
			for (int c = 0; c < secondRow; c++)
				for (int d = 0; d < secondColumn; d++)
					second[c][d] = in.nextInt();
			for (int c = 0; c < firstRow; c++) {
				for (int d = 0; d < secondColumn; d++) {
					for (int k = 0; k < secondRow; k++) {
						sum = sum + first[c][k]*second[k][d];
					}
					multiply[c][d] = sum;
					sum = 0;
			}
		}
		System.out.println("Product of the matrices:");
		for (int c = 0; c < firstRow; c++) {
			for (int d = 0; d < secondColumn; d++)
				System.out.print(multiply[c][d]+"\t");
			System.out.print("\n");
			}
		}
	}
}
*/


import java.util.*;
public class MatrixMultiplicationArray {
	 
public static void main(String[] args)	{
	
	int a[][]= {{1,2},{2,4}};
	int b[][]= {{5,6,7},{8,9,10}};
	int c[][]=new int[2][3];
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			 c[i][j]=0;
			 for(int k=0;k<2;k++)
			 {
				c[i][j] +=a[i][k]* b[k][j];
			 }
		}
		
	}
	for(int i=0;i<2;i++)
	{
		for(int j=0;j<3;j++)
		{
			System.out.print(c[i][j]+" ");
		}
		System.out.println();
	}
	
	}

}











