package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product195;

public class Program196 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Product195> list = new ArrayList<>();
		
		list.add(new Product195("Tv",900.));
		list.add(new Product195("Mouse",50.));
		list.add(new Product195("Tablet",350.5));
		list.add(new Product195("HD Case",80.9));
		
		double factor = 1.1;
		
		list.forEach(p -> p.setPrice(p.getPrice()*factor));
		
		list.forEach(System.out::println);
		
	}

}
