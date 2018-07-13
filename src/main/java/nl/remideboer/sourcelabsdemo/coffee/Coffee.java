package nl.remideboer.sourcelabsdemo.coffee;

public class Coffee {

	private int id;

	private String name;

	private double price; // BigDecimal of long gebruiken nu even simpel

	public Coffee(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

}
