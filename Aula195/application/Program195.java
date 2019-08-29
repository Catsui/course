package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import entities.Product195;

public class Program195 {

	public static void main(String[] args) {
		
		List<Product195> list = new ArrayList<>();
		
		list.add(new Product195("Tv",900.));
		list.add(new Product195("Mouse",50.));
		list.add(new Product195("Tablet",350.5));
		list.add(new Product195("HD Case",80.9));
		
		double min = 100.;
		
		list.removeIf(p -> p.getPrice() >= min);
		
		for (Product195 p:list) {
			System.out.println(p);
		}
	}

}
