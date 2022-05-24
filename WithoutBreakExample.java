package SwitchStatements;

public class WithoutBreakExample {
	public static void main(String[] args) {
		int num = 10;
		switch(num) {
		case 10:
			System.out.println("The Number is 10.");
			break;
		case 20:
			System.out.println("The Number is 20.");
			break;
		case 30:
			System.out.println("The Number is 30.");
			break;
		case 40:
			System.out.println("The Number is 40.");
			break;
		case 50:
			System.out.println("The Number is 50.");
			break;
		default:
			System.out.println("Default...");
			break;
		}
	}
}
