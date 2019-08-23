package model.entities;

import model.enums.Color172;

public abstract class AbstractShape172 implements Shape172 {
	
	private Color172 color;

	public AbstractShape172(Color172 color) {
		this.color = color;
	}

	public Color172 getColor() {
		return color;
	}

	public void setColor(Color172 color) {
		this.color = color;
	}
		
}
