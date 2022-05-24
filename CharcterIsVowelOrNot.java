package SwitchStatements;

import java.util.Scanner;

public class CharcterIsVowelOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter only CAPITAL Alphabets: ");
		System.out.println("Enter the Character: ");
		char vowel = sc.next().charAt(0);
		switch(vowel) {
		case 'A':
			System.out.println("The Given Character " +vowel +" is VOWEL.");
			break;
		case 'E':
			System.out.println("The Given Character " +vowel +" is VOWEL.");
			break;
		case 'I':
			System.out.println("The Given Character " +vowel +" is VOWEL.");
			break;
		case 'O':
			System.out.println("The Given Character " +vowel +" is VOWEL.");
			break;
		case 'U':
			System.out.println("The Given Character " +vowel +" is VOWEL.");
			break;
		default:
			System.out.println("The Given Character is NOT a VOWEL.");
			
		}
	}
}
