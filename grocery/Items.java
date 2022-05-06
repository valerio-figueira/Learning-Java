package grocery;

public class Items extends Purchase {
	private String name;
	private double value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		String description = "\nItem: " + this.name;
		return description += "\nValue per unit: R$" + this.value;
	}
}
