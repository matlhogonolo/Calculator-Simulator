import java.util.Scanner;

public class CalculatorSimulator {

	public static void main(String[] args) {

		while (true) {

			Scanner sc = new Scanner(System.in);

			System.out.println(" what would you like to do ? \n (1)"
					+ " Addition \n (2) Subtration \n (3) Division \n (4) Multiplication");

			int operation = sc.nextInt();

			int num1;
			int num2;

			switch (operation) {

			case 1:

				System.out.println("Enter any number");
				num1 = sc.nextInt();
				System.out.println("Enter another number");
				num2 = sc.nextInt();

				System.out.println(num1 + " + " + num2 + " = " + addition(num1, num2));
				break;
			case 2:

				System.out.println("Enter any number");
				num1 = sc.nextInt();
				System.out.println("Enter another number");
				num2 = sc.nextInt();

				System.out.println(num1 + " - " + num2 + " = " + subtraction(num1, num2));
				break;
			case 3:
				
				System.out.println("Enter any number");
				num1=sc.nextInt();
				System.out.println("Enter another number");
				num2 = sc.nextInt();
				
				System.out.println(num1 + " / " + num2 + " = " + division (num1, num2));		
				break;
			case 4:
				System.out.println("Enter any number");
				num1=sc.nextInt();
				System.out.println("Enter another number");
				num2=sc.nextInt();
				
				System.out.println(num1 + " * " + num2 + " = " + multiplication (num1, num2));
				
	
				break;
			default:
				System.out.println("Invalid input ?!!!!!!!!!!!!!");

				
				
				break;

			}

		}

	}

	public static int addition(int num1, int num2) {
		
		return num1 + num2;
	}
	
	public static int subtraction(int num1, int num2) {
		
		return num1 - num2;
	}
	public static int division(int num1, int num2) {
		
		return num1 / num2;
	}
	public static int multiplication(int num1,int num2) {
		
		return num1 * num2;
	}
	
}
