package entities;

public class Rectangle181 implements Shape181{
	
	private Double width;
	private Double height;
	
	public Rectangle181(Double width, Double height) {
		this.width = width;
		this.height = height;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return height * width;
	}	
	

}
