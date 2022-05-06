package grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
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
		Grocery g = new Grocery();
		g.setProducts(new ArrayList<Items>());
		Controller c = new Controller();
		
		g.setGroceryName("Meals Delight Store");

		String decision = "";
		while (true) {
			c.addProducts(g);
			do {
				decision = typeText("Want to continue? (Yes | Not): ");
			} while (!decision.equalsIgnoreCase("yes") && !decision.equalsIgnoreCase("not"));
			if (decision.equalsIgnoreCase("not")) {
				break;
			}
		}
		for (int i = 0; i < g.getProducts().size(); i++) {
			printDescription(g.getProducts().get(i).toString());
		}
	}
}
