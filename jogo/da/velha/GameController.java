package jogo.da.velha;

import java.util.Scanner;

public class GameController {
	JogoVelha g = new JogoVelha();
	Scanner scanner;

	GameController(Scanner scanner) {
		this.scanner = scanner;
	}

	GameController() {
		this(new Scanner(System.in));
	}

	int typeNum(String text) {
		System.out.print(text);
		return scanner.nextInt();
	}

	void setWinner(char[][] tab, int empate) {
		while (true) {
			printTab(tab);
			firstPlayer(tab, g.getLine(), g.getColumn());
			empate++;
			if (getWinner(tab, 'X')) {
				printTab(tab);
				System.out.println("O primeiro jogador é o Vencedor");
				break;
			}
			printTab(tab);
			secondPlayer(tab, g.getLine(), g.getColumn());
			empate++;
			if (getWinner(tab, 'O')) {
				printTab(tab);
				System.out.println("O segundo jogador é o Vencedor");
				break;
			}
			if (empate == 9) {
				System.out.println("Empate!");
				break;
			}
		}
	}

	char[][] printTab(char[][] tab) {
		System.out.println(":::::::::::::::::::::::");
		for (int i = 0; i < tab.length; i++) {
			System.out.print("::::::::|");
			for (int j = 0; j < tab[i].length; j++) {
				System.out.print(tab[i][j] + "|");
			}
			System.out.print("::::::::\n");
		}
		System.out.println(":::::::::::::::::::::::");
		return tab;
	}

	char firstPlayer(char[][] tab, int line, int column) {
		while (true) {
			System.out.println("First Player - X");
			line = typeNum("Digite a linha: ");
			column = typeNum("Digite a coluna: ");
			line--;
			column--;
			if (tab[line][column] != 'X' && tab[line][column] != 'O') {
				break;
			} else {
				System.out.println("Inválido");
			}
		}
		return tab[line][column] = 'X';
	}

	char secondPlayer(char[][] tab, int line, int column) {
		while (true) {
			System.out.println("First Player - O");
			line = typeNum("Digite a linha: ");
			column = typeNum("Digite a coluna: ");
			line--;
			column--;
			if (tab[line][column] != 'X' && tab[line][column] != 'O') {
				break;
			} else {
				System.out.println("Inválido");
			}
		}
		return tab[line][column] = 'O';
	}

	boolean getWinner(char[][] tab, char player) {
		if (checkLine(tab, player)) {
			return true;
		} else if (checkColumn(tab, player)) {
			return true;
		} else if (checkDiagonal(tab, player)) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkLine(char[][] tab, char player) {
		if (tab[0][0] == player && tab[0][1] == player && tab[0][2] == player) {
			return true;
		} else if (tab[1][0] == player && tab[1][1] == player && tab[1][2] == player) {
			return true;
		} else if (tab[2][0] == player && tab[2][1] == player && tab[2][2] == player) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkColumn(char[][] tab, char player) {
		if (tab[0][0] == player && tab[1][0] == player && tab[2][0] == player) {
			return true;
		} else if (tab[0][1] == player && tab[1][1] == player && tab[2][1] == player) {
			return true;
		} else if (tab[0][2] == player && tab[1][2] == player && tab[2][2] == player) {
			return true;
		} else {
			return false;
		}
	}

	boolean checkDiagonal(char[][] tab, char player) {
		if (tab[0][0] == player && tab[1][1] == player && tab[2][2] == player) {
			return true;
		} else if (tab[0][2] == player && tab[1][1] == player && tab[2][0] == player) {
			return true;
		} else {
			return false;
		}
	}
}
