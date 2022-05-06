package imc;

import java.util.Scanner;

public class IMC {
	public static Scanner getScanner(Scanner scanner) {
		Scanner scan = scanner;
		return scan;
	}

	public static double typeNum(String text) {
		System.out.print(text);
		return getScanner(new Scanner(System.in)).nextDouble();
	}

	public static void printDescription(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {
		double peso = typeNum("Digite seu peso: ");
		double altura = typeNum("Digite sua altura: ");
		double imc = peso / Math.pow(altura, 2); // The Math class is one with all methods as static methods

		printDescription("Sua Massa Corporal é de : " + imc);
	}
}
