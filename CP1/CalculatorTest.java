package cp1_hw;

import java.util.*;

public class CalculatorTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str;
		String[] str_s = new String[3];

		try {
			str = sc.nextLine();
			String[] str_e = str.split(" ");
			
			System.out.println("==========");
			
			for(int i=0; i<3; i++) {
				str_s[i] = str_e[i];
			}

		} catch (NoSuchElementException e) {
			System.out.println("==========");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
		}

		try {
			int result = calculate(getNumber(str_s[0]), getNumber(str_s[2]), str_s[1]);
			System.out.println("The result is : " + result);
		} catch (Exception e) {
		}

		System.out.println("It's Done");
	}

	static int getNumber(String str) {
		int result;

		try {
			result = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			result = str.length();
		}
		return result;
	}

	static int calculate(int operand1, int operand2, String operator) throws ArithmeticException, OperatorException {
		int result;

		try {
			switch (operator) {
			case "+":
				result = operand1 + operand2;
				break;
			case "-":
				result = operand1 - operand2;
				break;
			case "*":
				result = operand1 * operand2;
				break;
			case "/":
				result = operand1 / operand2;
				break;
			case "%":
				result = operand1 % operand2;
				break;
			default:
				throw new OperatorException("Not an operator.");
			}
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			throw e;
		} catch (OperatorException e) {
			System.out.println(e.getMessage());
			throw e;
		}
		return result;
	}
}

class OperatorException extends Exception {
	OperatorException(String msg) {
		super(msg);
	}
}
