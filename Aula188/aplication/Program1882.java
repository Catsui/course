package aplication;

import java.util.HashMap;
import java.util.Map;

import entities.Product188;

public class Program1882 {
	
	public static void main (String[] args) {
		
		Map<Product188,Double> stock = new HashMap<>();
		
		Product188 p1 = new Product188("Tv",900.0);
		Product188 p2 = new Product188("Notebook",1200.0);
		Product188 p3 = new Product188("Tablet",400.0);
		
		stock.put(p1,10000.0);
		stock.put(p2,20000.0);
		stock.put(p3,15000.0);
		
		Product188 ps = new Product188("Tv", 900.0);
		System.out.println(stock.containsKey(ps));
		
	}
	
}
