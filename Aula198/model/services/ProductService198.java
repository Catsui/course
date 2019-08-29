package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Product195;

public class ProductService198 {
	
	public double filteredSum(List<Product195> list, Predicate<Product195> criteria) {
		double sum = 0.;
		for (Product195 p:list) {
			if(criteria.test(p)) {
				sum += p.getPrice();
			}
		}
		return sum;
	}

}
