package model.entities;

import model.enums.Color172;

public class Circle172 extends AbstractShape172{
	
	private Double radius;
	
	public Circle172(Color172 color, Double radius) {
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
