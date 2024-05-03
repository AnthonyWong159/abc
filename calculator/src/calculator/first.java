package calculator;

import java.util.Scanner;

public class first {

	public static void main(String[] args) {
		Scanner calculatorObj = new Scanner(System.in);
		Scanner numObj = new Scanner(System.in);
		Scanner operatorObj = new Scanner(System.in);
		Scanner ContinueObj = new Scanner(System.in);
		calculate c = new calculate();

		String calculator = "";
		String operator = "";
		float result = 0;
		int n = 2;
		float[] num = new float[2];

		while (true) {
			System.out.println("Calculator? (Y/N)");
			calculator = calculatorObj.nextLine();
			
			switch (calculator) {
			case "Y":
				for (int i = 0; i < n + 1; i++) {

					// input number
					if (i % 2 == 0) {
						System.out.println("Please input numbers.");
						String num_string = numObj.nextLine();
						if (c.check(num_string, i) == true) {
							if (i == 0) {
								num[0] = Float.parseFloat(num_string);
							} else {
								num[1] = Float.parseFloat(num_string);
							}
						} else {
							i--;
						}

					// input operator
					} else if (i % 2 > 0) {
						System.out.println("Please input operator.");
						operator = operatorObj.nextLine();
						if (c.check(operator, i) == true) {
							System.out.println(operator);
						} else {
							i--;
						}
					}

					// calculate result
					if (i == n) {
						switch(operator) {
						case "+":
							result = c.add(num[0], num[1]);
							break;
							
						case "-":
							result = c.minus(num[0], num[1]);
							break;
							
						case "*":
							result = c.multiply(num[0], num[1]);
							break;
							
						case "/":
							result = c.divide(num[0], num[1]);
							break;
						}
						System.out.println(num[0] + operator + num[1] + " = " + result);

						// ask continue
						while (true) {
							System.out.println("continue? (Y/N)");
							String Continue = ContinueObj.nextLine();
							if (Continue.equals("Y")) {
								num[0] = result;
								n = n + 2;
								break;
							} else if (Continue.equals("N")) {
								num[0] = num[1] = 0;
								n = 2;
								break;
							} else {
								System.out.println("error");
							}
						}
					}
				}
				break;
				
			case "N":
				System.out.println("Thanks you!");
				System.exit(0);
				
			default:
				System.out.println("error");
			}
		}
	}
}
