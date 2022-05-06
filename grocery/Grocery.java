package grocery;

import java.util.ArrayList;

public class Grocery extends Items{
	private String GroceryName;
	private ArrayList<Items> products;

	public ArrayList<Items> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Items> products) {
		this.products = products;
	}

	public void addProducts(Items products) {
		this.products.add(products);
	}

	public String getGroceryName() {
		return GroceryName;
	}

	public void setGroceryName(String groceryName) {
		GroceryName = groceryName;
	}

	public String toString() {
		String description = "Grocery's Name: " + this.GroceryName;
		return description += super.toString();
	}

}
