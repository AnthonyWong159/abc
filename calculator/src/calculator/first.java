package calculator;

import java.util.Scanner;

public class first {
	
	static void add(float x, float y) {		
		System.out.println(x + " + " + y + " = " + (x+y));		
	}
	static void minus(float x, float y) {
		System.out.println(x + " - " + y + " = " + (x-y));
	}
	static void multiply(float x, float y) {
		System.out.println(x + " * " + y + " = " + (x*y));
	}
	static void divide(float x, float y) {
		System.out.println(x + " / " + y + " = " + (x/y));
	}
	
	public static void main(String[] args) {
		Scanner calculatorObj = new Scanner(System.in);
		Scanner num1Obj = new Scanner(System.in);
		Scanner num2Obj = new Scanner(System.in);
		Scanner operatorObj = new Scanner(System.in);

		String calculator = "Y";
		float num1 = 0;
		float num2 = 0;
		boolean checkoperator = true;

		while (calculator.equals("Y")) {
			System.out.println("Calculator? (Y/N)");
			calculator = calculatorObj.nextLine();
			
			if (calculator.equals("Y")) {
				while (true) {
					try {
						System.out.println("Please input first numbers.");
						num1 = num1Obj.nextFloat();
						break;
					} catch (Exception e) {
						System.out.println("Please try again!");
						num1Obj.next();
					}
				}
				while (true) {
					try {
						System.out.println("Please input second numbers.");
						num2 = num2Obj.nextFloat();
						break;
					} catch (Exception e) {
						System.out.println("Please try again!");
						num2Obj.next();
					}
				}

				while (checkoperator = true) {
					System.out.println("Which operator? (+ - * /)");
					char operator = operatorObj.next().charAt(0);
					if (operator == '+') {
						add(num1, num2);
						break;
					} else if (operator == '-') {
						minus(num1, num2);
						break;
					} else if (operator == '*') {
						multiply(num1, num2);
						break;
					} else if (operator == '/') {
						divide(num1, num2);
						break;
					} else {
						System.out.println("Please try again!");
						checkoperator = false;
					}
				}

			} else if (calculator.equals("N")) {
				System.out.println("Thanks you!");
				System.exit(0);
			} else {
				System.out.println("Please try again!");
				calculator = "Y";
			}

		}

	}
}

