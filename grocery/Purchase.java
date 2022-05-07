package grocery;

public class Purchase {
	private String name;
	private double price;
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String desc = this.name;
		desc += " - Price: R$" + this.price;
		return desc += " - Quantity: " + this.amount;
	}

}
