package calculator;

import java.util.Scanner;

public class Test {
	public static Scanner getScan(Scanner scan) {
		Scanner scanner = scan;
		return scanner;
	}

	public static double typeValue(String description) {
		System.out.print(description);
		return getScan(new Scanner(System.in)).nextDouble();
	}

	public static String typeText(String description) {
		System.out.print(description);
		return getScan(new Scanner(System.in)).next();
	}

	public static void printDescription(String description) {
		System.out.println(description);
	}

	public static void main(String[] args) {
		double result = 0;
		String option = "";
		while (true) {
			double n1 = typeValue("Insert the value of first number: ");
			do {
				option = typeText("Insert the operation's type (/, *, +, -): ");
				if (!option.equals("*") && !option.equals("/") && !option.equals("+") && !option.equals("-")) {
					printDescription("Invalid option");
				}
			} while (!option.equals("*") && !option.equals("/") && !option.equals("+") && !option.equals("-"));
			double n2 = typeValue("Insert the value of second number: ");

			if (option.equals("/")) {
				result = calculator.division(n1, n2);
			} else if (option.equals("*")) {
				result = calculator.multiplication(n1, n2);
			} else if (option.equals("+")) {
				result = calculator.addition(n1, n2);
			} else if (option.equals("-")) {
				result = calculator.subtraction(n1, n2);
			}

			printDescription(n1 + " " + option + " " + n2 + " = " + result);
		}
	}
}
