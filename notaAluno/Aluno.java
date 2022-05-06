package notaAluno;

import java.util.Scanner;

public class Aluno {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a nota do aluno: ");
		double nota = scanner.nextDouble();

		boolean aprovado = nota >= 70;

		if (aprovado) {
			System.out.println("Parabéns! Foi aprovado :)");
		} else {
			System.out.println("Aluno reprovado! :(");
		}
	}
}
