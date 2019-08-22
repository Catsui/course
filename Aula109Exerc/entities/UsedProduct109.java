package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct109 extends Product109 {
	
	SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
	private Date manufactureDate;
	
	public UsedProduct109 () {
		super();
	}

	public UsedProduct109(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " (used) $ " + super.getPrice() + 
				" (Manufacture date: " + sdf.format(manufactureDate) + ")";
		
	}

}
