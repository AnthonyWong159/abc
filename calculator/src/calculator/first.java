package calculator;

import java.util.Scanner;

public class first {
	public static void main(String[] args) {
		Scanner calculatorObj = new Scanner(System.in);
		Scanner num1Obj = new Scanner(System.in);
		Scanner num2Obj = new Scanner(System.in);
		Scanner operatorObj = new Scanner(System.in);

		String calculator = "Y";
		float num1 = 0;
		float num2 = 0;
		boolean checkoperator = true;

		while (calculator == "Y") {
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
						System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
					} else if (operator == '-') {
						System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
					} else if (operator == '*') {
						System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
					} else if (operator == '/') {
						System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
					} else {
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

