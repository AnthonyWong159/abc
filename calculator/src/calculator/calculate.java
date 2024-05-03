package calculator;

public class calculate {
	static float add(float x, float y) {
		return x + y;
	}

	static float minus(float x, float y) {
		return x - y;
	}

	static float multiply(float x, float y) {
		return x * y;
	}

	static float divide(float x, float y) {
		return x / y;
	}

	static boolean check(String input, int i) {

		if ((i % 2) == 0) {
			try {
				Float.parseFloat(input);
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			if (input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/")) {
				return true;
			} else
				return false;
		}
	}
}
