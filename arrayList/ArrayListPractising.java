package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractising {

	static Scanner getScanner(Scanner scanner) {
		Scanner scan = scanner;
		return scan;
	}

	static String typeText(String text) {
		System.out.print(text);
		return getScanner(new Scanner(System.in)).next();
	}

	static void printArray(String string) {
		System.out.println(string);
	}

	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<String>();

		nomes.add("Joaquim");
		nomes.add("Joaquina");
		nomes.add("Dulcinéia");
		nomes.add("Percival");

		for (int i = 0; i < nomes.size(); i++) {
			printArray(nomes.get(i));
		}

		System.out.print("\n");
		for (int i = 0; i < nomes.size(); i++) {
			nomes.set(i, typeText("Digite um nome para modificar " + nomes.get(i) + ": "));
		}
		System.out.print("\n");
		for (int i = 0; i < nomes.size(); i++) {
			printArray(nomes.get(i));
		}

		nomes.clear();

		for (int i = 0; i < nomes.size(); i++) {
			printArray(nomes.get(i)); // Não imprimirá nada porque a lista foi removida.
		}
	}
}
