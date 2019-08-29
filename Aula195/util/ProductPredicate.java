package util;

import java.util.function.Predicate;

import entities.Product195;

public class ProductPredicate implements Predicate<Product195>{

	@Override
	public boolean test(Product195 p) {
		return p.getPrice() >= 100.;
	}
	
	

}
