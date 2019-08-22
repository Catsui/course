package entities;

import entities.enums.Color111;

public class Circle111 extends Shape111{
	
	private Double radius;
	
	public Circle111() {
		super();
	}

	public Circle111(Color111 color, Double radius) {
		super(color);
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	

}
