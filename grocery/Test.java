package grocery;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	static final int QT_TO_DEDUCTION = 20;
	static final int PERCENTAGE = 10;

	public static Scanner getScanner(Scanner scanner) {
		Scanner scan = scanner;
		return scan;
	}

	public static String typeText(String description) {
		System.out.print(description);
		return getScanner(new Scanner(System.in)).next();
	}

	public static int typeNum(String description) {
		System.out.print(description);
		return getScanner(new Scanner(System.in)).nextInt();
	}

	public static void printDescription(String description) {
		System.out.println(description);
	}

	public static void main(String[] args) {
		ArrayList<Purchase> p = new ArrayList<Purchase>();
		Controller c = new Controller();
		DecimalFormat dF = new DecimalFormat("##.00");
		double totalPrice = 0;
		int qtTotal = 0;

		c.addCar(p);

		for (Purchase list : p) {
			totalPrice += (list.getPrice() * list.getAmount());
			qtTotal += list.getAmount();
		}

		if (qtTotal >= QT_TO_DEDUCTION) {
			totalPrice -= ((totalPrice * PERCENTAGE) / 100);
		}

		printDescription(p.toString());
		printDescription("Total price: R$" + dF.format(totalPrice));
	}
}
