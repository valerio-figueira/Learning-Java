package jogodavelha;

public class ExerJogoVelha {

	public static void main(String[] args) {
		JogoVelha g = new JogoVelha();
		GameController gc = new GameController();

		g.setTab(new char[3][3]);
		g.setEmpate(1);

		gc.setWinner(g.getTab(), g.getEmpate());
		
	}
}