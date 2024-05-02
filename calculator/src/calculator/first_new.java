package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class first {
	
	public static void main(String[] args) {
		Scanner calculatorObj = new Scanner(System.in);
		String calculator = "";
		int flag = 0; //flag for define current stage
		int total_stage = 3;
		ArrayList<String> msg = new ArrayList<String>(total_stage); //array to store those display message
		msg.add("Calculator? (Y/N)");
		msg.add("Please input first numbers.");
		msg.add("Please input second numbers.");
		msg.add("Which operator? (+ - * /)");
		ArrayList<String> err_msg = new ArrayList<String>(total_stage); //array to store error message
		err_msg.add("Exit...");
		err_msg.add("Please re-input first numbers!");
		err_msg.add("Please re-input second numbers!");
		err_msg.add("Wrong input! Please re-enter the operator (+ - * /)");		
		
		while(true) {
		switch(calculator) {
		  case "Y":
			  for(int i=1; i<=total_stage; i++) {
					System.out.println(msg.get(i));
					calculator = calculatorObj.nextLine();
					flag = i;
					i = i + checking(calculator.toString(), flag, total_stage, err_msg);
				  }
				System.exit(0);
		  case "N":
				System.out.println(err_msg.get(0));
				System.exit(0);
		  default:
				System.out.println(msg.get(0));
				calculator = calculatorObj.nextLine();			  
		}
	  }
	}
	
	static int checking(String x, int flag, int total_stage, ArrayList<String> err_msg) {
		int checkResult = 0;
		if(flag > 0 && flag < total_stage) {
			try {
			  Float.parseFloat(x);
			}catch (NumberFormatException nfe) {
				checkResult--;
			}
		}else {
			if(x.matches("[\\\\+\\\\-\\\\*\\\\/\\\\]+")==false) {
				checkResult--;
			}
		}
		//processing();
		return checkResult;
    } 	    

	static void processing(String x, int currIndex, int checkResult, ArrayList<String> err_msg, float num1, float num2, int total_stage) {
		if(checkResult < 0) {
		  System.out.println(err_msg.get(currIndex));
		}else if(checkResult >= 1 && currIndex == total_stage){
			calculate c = new calculate(); 
			if (x == "+") {
				c.add(num1, num2);
			} else if (x == "-") {
				c.minus(num1, num2);
			} else if (x == "*") {
				c.multiply(num1, num2);
			} else if (x == "/") {
				c.divide(num1, num2);
			}			
		}
    } 	
	
}

