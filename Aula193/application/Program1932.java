package application;

import java.util.ArrayList;
import java.util.List;

import entities.Product193;

public class Program1932 {

	public static int compareProducts(Product193 p1, Product193 p2) {
		return p1.getPrice().compareTo(p2.getPrice());
	}

	public static void main(String[] args) {
		List<Product193> list = new ArrayList<>();
		list.add(new Product193("TV", 900.00));
		list.add(new Product193("Notebook", 1200.00));
		list.add(new Product193("Tablet", 450.00));
		list.sort(Program1932::compareProducts);
		list.forEach(System.out::println);
	}
}
