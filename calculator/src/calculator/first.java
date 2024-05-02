package calculator;

import java.util.Scanner;

public class first {
	  public static void main(String[] args) {
		  Scanner answerObj = new Scanner(System.in);
		  
		  char answer = 'Y';
		  
		  while (answer == 'Y') {
		  
		  System.out.println("Calculator? (Y/N)");
		  answer = answerObj.next().charAt(0);  
		  
		  if (answer == 'Y' ) {
			  
			  //input two numbers
			  Scanner no1Obj = new Scanner(System.in);
			  Scanner no2Obj = new Scanner(System.in);
			  System.out.println("Please input first numbers?");
			  float no1 = no1Obj.nextFloat();
			  System.out.println("Please input second numbers?");
			  float no2 = no1Obj.nextFloat();
			  System.out.println("Your input is " + no1 + " and " + no2);
			  
			  //input operator
			  Scanner operatorObj = new Scanner(System.in);
			  System.out.println("Which operator? (+ - * /)");
			  char operator = operatorObj.next().charAt(0);
			  System.out.println("Your input is " + operator);
			  
			  if (operator == '+') {
				  System.out.println(no1 + " + " + no2 + " = " + (no1 + no2) );
			  }
			  else if (operator == '-') {
				  System.out.println(no1 + " - " + no2 + " = " + (no1 - no2) );
			  }
			  else if (operator == '*') {
				  System.out.println(no1 + " * " + no2 + " = " + (no1 * no2) );
			  }
			  else if (operator == '/') {
				  System.out.println(no1 + " / " + no2 + " = " + (no1 / no2) );
			  }
			  
		  else if (answer == 'N' ) {
			  System.out.println("Thanks you!");
			  System. exit(0);
			  }
		  }
	}
		  }
	  }
