package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product192;

public class Program192 {

	public static void main(String[] args) {
		
		List<Product192> list = new ArrayList<>();
		
		list.add(new Product192("TV",900.));
		list.add(new Product192("Notebook",1200.));
		list.add(new Product192("Tablet",450.));
										
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product192 p:list) {
			System.out.println(p);
		}

	}

}
