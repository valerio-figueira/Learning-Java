package grocery;

import java.util.Scanner;

public class Controller {
	Scanner scanner = new Scanner(System.in);

	String typeText(String text) {
		System.out.print(text);
		return scanner.next();
	}

	double typeValue(String text) {
		System.out.print(text);
		return scanner.nextDouble();
	}

	int typeAmount(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	void printText(String description) {
		System.out.print(description);
	}

	Grocery setGroceryName(Grocery g) {
		g.setGroceryName(typeText("Insert the Grocery's Name: "));
		return g;
	}

	Grocery addProducts(Grocery grocery) {
		Items g = new Items();
		g.setName(typeText("Type the product's name: "));
		g.setValue(typeValue("Insert the value for each unit: "));
		grocery.addProducts(g);
		return grocery;
	}

	Purchase setPurchase(Grocery g, Purchase p) {
		// while(true) {}
		printText("Item's List: ");
		for (Items i : g.getProducts()) {
			printText(i.getName() + ", ");
		}
		printText(".");

		typeText("");
		return p;
	}
}
