package util;

import java.util.function.Function;

import entities.Product195;

public class UpperCaseName implements Function<Product195,String>{

	@Override
	public String apply(Product195 p) {
		return p.getName().toUpperCase();
	}
	
	

}
