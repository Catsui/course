package util;

import java.util.function.Consumer;

import entities.Product195;

public class PriceUpdate implements Consumer<Product195> {

	@Override
	public void accept(Product195 p) {
		p.setPrice(p.getPrice()*1.1);
	}
			
}
