package LoopExample;

import java.util.Scanner;

public class ReverseTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int row = sc.nextInt();
		
		
		for(int i=row; i>=1; i--) {
			for(int j=row; j>=i; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
}