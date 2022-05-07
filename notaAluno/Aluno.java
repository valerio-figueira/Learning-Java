package notaAluno;

import java.util.Scanner;

public class Aluno {
	static final int NOTA_MINIMA = 70;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a nota do aluno: ");
		double nota = scanner.nextDouble();

		boolean aprovado = nota >= NOTA_MINIMA;

		if (aprovado) {
			System.out.println("Parabéns! Foi aprovado :)");
		} else {
			System.out.println("Aluno reprovado! :(");
		}
	}
}
