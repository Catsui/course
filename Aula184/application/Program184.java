package application;

import java.util.Set;
import java.util.TreeSet;

import entities.Product184;

public class Program184 {

	public static void main(String[] args) {

		/*Set<Product184> set = new HashSet<>();

		set.add(new Product184("TV", 900.00));
		set.add(new Product184("Notebook", 1200.00));
		set.add(new Product184("Tablet", 400.0));

		Product184 prod = new Product184("Notebook", 1200.00);

		System.out.println(set.contains(prod)); // Se a classe não contem hashCode e equals, o HashSet procura por
												// ponteiros, acusando "false"*/
		
		Set<Product184> set = new TreeSet<>();

		set.add(new Product184("TV", 900.00));
		set.add(new Product184("Notebook", 1200.00));
		set.add(new Product184("Tablet", 400.0));

		for (Product184 p:set) {
			System.out.println(p);
		}
	}

}
