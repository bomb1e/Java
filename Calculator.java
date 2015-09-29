import java.util.Scanner;

/*
Assumptions:
1. This calculator takes int, float and double as inputs.
*/

/*
Tabby & Eric
*/

public class Calculator {

	// Addition
	public static void add (float a, float b) {
		float sum = a + b;
		System.out.println("Sum is: " + sum);	
	}

	public static void average (int a, int b) {
		float aveResult = (float) a + ((float) b - (float) a) / 2;
		System.out.println("Average is: " + aveResult);
	}

	// Subtraction
	public static void subtract (float a, float b) {
		float difference = a - b;
		System.out.println("Difference is: " + difference);
	}

	// Multiplication
	public static void multiply (float a, float b) {
		double product = a * b;
		System.out.println("Product is: " + product);
	}

	// Division
	public static void divide (float a, float b) {
		if (b == 0) {
			System.out.println("Math Error: Cannot divide by zero!");
		}
		double division = a / b;
		System.out.println("Division is: " + division);
	}

	// Square root
	public static void squareRoot (int a) {		
		double num;
		double resultSquareRoot = a / 2;

		do {
			num = resultSquareRoot;
			resultSquareRoot = (num + (a / num)) / 2; 
		}
		while ((num - resultSquareRoot) != 0);
		System.out.println("The square root of " + a + " is: " + resultSquareRoot);
	}

	// Power
	public static void power (float a, float b) {
		double resultPower = 1;
		for (int i = 0; i < b; i++) {
			resultPower *= a;
		}
		System.out.println("The result of " + a + " ^ " + b + " is: " + resultPower);
	}

	// Modulus
	public static void mod (int a, int b) {
		int resultMod;
		if (b > a) {
			resultMod = b % a;
		}
		else {
			resultMod = a % b;
		}
		System.out.println("The mod of " + a + " & " + b + " is: " + resultMod);
	}

	public static void main (String args[]) {
		int num1, num2;
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome!\n What do you want to do?\n 1.Addition 2.Subtract 	3.Multiply\n 4.Divide	5.Modulus	6.Average\n 7.Squareroot  8.Power");
		int choice = Integer.parseInt(in.nextLine());
 
		if (!(choice < 1 || choice > 8)) {
			 if (choice == 7) {
			 	System.out.println("Enter Number  to Find Square Root Of...: ");
			 	num1 = Integer.parseInt(in.nextLine());
			 	squareRoot(num1);
			 }
			 else {
			 	System.out.println("Enter First Number... ");
			 	num1 = Integer.parseInt(in.nextLine());
			 	System.out.println("Enter Second Number... ");
			 	num2 = Integer.parseInt(in.nextLine());

			 	switch (choice) {
			 		case 1: add(num1, num2); break;
			 		case 2: subtract(num1, num2); break;
			 		case 3: multiply(num1, num2); break;
			 		case 4: divide(num1, num2); break;
			 		case 5: mod(num1, num2); break;
			 		case 6: average(num1, num2); break;
			 		case 8: power(num1, num2); break;

			 		default: System.out.println("Please Enter Valid Choice (1->8)"); break;
			 	}
		 	}
		 }
		 else {
		 		System.out.println("Wrong Choice\n Please Select The Above Options!");
		 	}
		 	 
	}
}