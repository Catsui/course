package entities;

import entities.enums.Color111;

public class Rectangle111 extends Shape111 {
	
	private Double width;
	private Double height;
	
	public Rectangle111 () {
		super();
	}	

	public Rectangle111(Color111 color, Double width, Double height) {
		super(color);
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
		return height*width;
	}

}
