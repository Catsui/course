package entities;

public class Product179 implements Comparable<Product179> {
	
	private String name;
	private Double price;
	
	public Product179(String name, Double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}	
	
	@Override
	public String toString() {
		return name + ", " + String.format("%.2f", price);
	}

	@Override
	public int compareTo(Product179 o) {
		return price.compareTo(o.getPrice());
	}
	
}
