package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product195;
import model.services.ProductService198;

public class Program198 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		List<Product195> list = new ArrayList<>();

		list.add(new Product195("Tv", 900.));
		list.add(new Product195("Mouse", 50.));
		list.add(new Product195("Tablet", 350.5));
		list.add(new Product195("HD Case", 80.9));
		
		ProductService198 ps = new ProductService198();
		
		double sum = ps.filteredSum(list, p -> p.getPrice()<100);
		
		System.out.println(sum);

	}

}
