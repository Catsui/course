package entities;

import entities.enums.Color111;

public abstract class Shape111 {
	
	private Color111 color;
	
	public Shape111() {
		
	}	

	public Shape111(Color111 color) {
		this.color = color;
	}

	public Color111 getColor() {
		return color;
	}

	public void setColor(Color111 color) {
		this.color = color;
	}
	
	public abstract double area();
}
