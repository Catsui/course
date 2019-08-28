package entities;

public class Circle181 implements Shape181 {
	
	private Double radius;
	
	public Circle181(Double radius) {
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
		return Math.PI*radius*radius;
	}
	
}
