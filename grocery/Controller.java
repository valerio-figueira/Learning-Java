package grocery;

import java.util.ArrayList;
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

	int typeNum(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	void printText(String description) {
		System.out.print(description);
	}

	ArrayList<Purchase> addCar(ArrayList<Purchase> items) {
		while (true) {
			Purchase p = new Purchase();
			p.setName(typeText("Insert the item's name: "));
			p.setPrice(typeValue("Insert the price: R$ "));
			p.setAmount(typeNum("Insert quantity: "));
			items.add(p);
			boolean exit = false;
			while (true) {
				Integer option = typeNum("Want to continue? 1 - Yes | 2 - Not: ");
				if (option.equals(1) || option.equals(2)) {
					if (option.equals(1)) {
						break;
					} else {
						exit = option.equals(2);
						break;
					}
				} else {
					printText("Invalid");
				}
			}
			if (exit) {
				break;
			}
		}
		return items;
	}
}
