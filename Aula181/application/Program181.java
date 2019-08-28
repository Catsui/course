package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle181;
import entities.Rectangle181;
import entities.Shape181;

public class Program181 {

	public static void main(String[] args) {
		
		List<Shape181> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle181(3.0, 2.0));
		myShapes.add(new Circle181(2.0));
		
		List<Circle181> myCircles = new ArrayList<>();
		myCircles.add(new Circle181(2.0));
		myCircles.add(new Circle181(3.0));
		
		
		System.out.println("Total area: " + totalArea(myShapes));

		System.out.println("Total circle areas: " + totalArea(myCircles));
	}
	
	public static double totalArea(List<? extends Shape181> list) { //O curinga diz que a lista pode receber qualquer Shape ou subclass de Shape
		double sum = 0.0;
		for (Shape181 s: list) {
			sum += s.area();
		}
		
		return sum;
	}

}
