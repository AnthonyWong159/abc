package calculator;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner calculatorObj = new Scanner(System.in);
		Scanner numObj = new Scanner(System.in);
		Scanner operatorObj = new Scanner(System.in);
		Scanner ContinueObj = new Scanner(System.in);
		calculate c = new calculate();

		String calculator = "Y";
		String Continue = "Y";
		String num_string;
		String operator = "";
		float result = 0;
		int n = 2;
		float[] num = new float[n + 1];

		while (calculator.equals("Y")) {
			System.out.println("Calculator? (Y/N)");
			calculator = calculatorObj.nextLine();
			if (calculator.equals("Y")) {
				for (int i = 0; i < n + 1; i++) {
					if (i % 2 == 0) {
						System.out.println("Please input numbers.");
						num_string = numObj.nextLine();
						if (c.check(num_string, i) == true) {
							if (i == 0) {
								num[0] = Float.parseFloat(num_string);
							} else {
								num[(i % 2) + 1] = Float.parseFloat(num_string);
							}
						} else {
							i--;
						}
					}
					else if (i % 2 > 0) {
						System.out.println("Please input operator.");
						operator = operatorObj.nextLine();
						if (c.check(operator, i) == true) {
							System.out.println(operator);
						} else {
							i--;
						}
					}
					if (i == n) {
						if (operator.equals("+")) {
							result = c.add(num[0], num[(i % 2) + 1]);
							System.out.println(num[0] + " + " + num[(i % 2) + 1] + " = " + result);
						} else if (operator.equals("-")) {
							result = c.minus(num[0], num[(i % 2) + 1]);
							System.out.println(num[0] + " - " + num[(i % 2) + 1] + " = " + result);
						} else if (operator.equals("*")) {
							result = c.multiply(num[0], num[(i % 2) + 1]);
							System.out.println(num[0] + " * " + num[(i % 2) + 1] + " = " + result);
						} else if (operator.equals("/")) {
							result = c.divide(num[0], num[(i % 2) + 1]);
							System.out.println(num[0] + " / " + num[(i % 2) + 1] + " = " + result);
						}
						while (Continue.equals("Y")) {
							System.out.println("continue?");
							Continue = ContinueObj.nextLine();
							if (Continue.equals("Y")) {
								num[0] = result;
								n = n + 2;
								break;
							} else if (Continue.equals("N")) {
								break;
							} else {
								Continue = "Y";
							}
						}
					}
				}
			} else if (calculator.equals("N")) {
				System.out.println("Thanks you!");
				System.exit(0);
			} else {
				calculator = "Y";
			}
		}
	}
}
