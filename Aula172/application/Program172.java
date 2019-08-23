package application;


import model.entities.AbstractShape172;
import model.entities.Circle172;
import model.entities.Rectangle172;
import model.enums.Color172;

public class Program172 {

	public static void main(String[] args) {

		AbstractShape172 s2 = new Circle172(Color172.BLACK, 2.0);
		AbstractShape172 s1 = new Rectangle172(Color172.WHITE, 2.0, 2.0);
		
		System.out.println("Circle color: " + s2.getColor());
		System.out.println("Circle area: " + String.format("%.3f", s2.area()));
		System.out.println("Rectangle color: " + s1.getColor());
		System.out.println("Rectangle area: " + String.format("%.3f", s1.area()));		
	}

}
