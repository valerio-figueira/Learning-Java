package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void printText(String description) {
		System.out.println(description);
	}

	public static Scanner getScanner(Scanner scanner) {
		Scanner scan = scanner;
		return scan;
	}

	public static String typeText(String description) {
		System.out.print(description);
		return getScanner(new Scanner(System.in)).nextLine();
	}

	public static int typeNum(String description) {
		System.out.print(description);
		return getScanner(new Scanner(System.in)).nextInt();
	}

	public static void main(String[] args) {
		Controller controller = new Controller();
		Agenda a = new Agenda();
		ArrayList<Contact> cList;
		cList = new ArrayList<Contact>();

		controller.setAgendaName(a);
		controller.setContactInfo(cList);

		printText("");
		printText(a.getAgendaName());

		for (Contact c : cList) {
			printText(c.toString());
		}

	}
}
