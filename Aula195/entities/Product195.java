package entities;

public class Product195 {
	
	private String name;
	private double price;
	
	public Product195(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public static String staticUpperCaseName(Product195 p) {
		return p.getName().toUpperCase();
	}
	
	public String nonStaticUpperCaseName() {
		return getName().toUpperCase();
	}


	@Override
	public String toString() {
		return "Product195 [name=" + name + ", price=" + price + "]";
	}			
}
