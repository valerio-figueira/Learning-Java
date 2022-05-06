package agenda;

public class Agenda {
	private String agendaName;

	public String getAgendaName() {
		return agendaName;
	}

	public void setAgendaName(String agendaName) {
		this.agendaName = agendaName;
	}

	public String toString() {
		String desc = "\nAgenda's name: " + this.agendaName;
		return desc;
	}
}
