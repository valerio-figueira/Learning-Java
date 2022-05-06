package agenda;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	Scanner getScanner(Scanner scanner) {
		Scanner scan = scanner;
		return scan;
	}

	String typeText(String description) {
		System.out.print(description);
		return getScanner(new Scanner(System.in)).nextLine();
	}

	int typeNum(String description) {
		System.out.print(description);
		return getScanner(new Scanner(System.in)).nextInt();
	}

	Agenda setAgendaName(Agenda a) {
		a.setAgendaName(typeText("Insert the agenda's name: "));
		return a;
	}

	void printText(String description) {
		System.out.println(description);
	}

	ArrayList<Contact> setContactInfo(ArrayList<Contact> c) {
		while (true) {
			boolean exit;
			Contact contact = new Contact();
			contact.setName(typeText("Insert the contact's name: "));
			contact.setPhone(typeText("Insert the phone: "));
			contact.setEmail(typeText("Insert e-mail: "));
			c.add(contact);
			while (true) {
				int selection = typeNum("Want to continue? 1 - Yes | 2 - Not: ");
				if (selection == 1 || selection == 2) {
					exit = selection == 2;
					break;
				} else {
					printText("Marque uma opção válida.");
				}
			}
			if (exit) {
				break;
			}
		}
		return c;
	}
}
