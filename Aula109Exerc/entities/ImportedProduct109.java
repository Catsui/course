package entities;

public class ImportedProduct109 extends Product109{
	
	private Double customsFee;
	
	public ImportedProduct109 () {
		super();
	}

	public ImportedProduct109(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	public Double totalValue() {
		return super.getPrice() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return super.getName() + " $ " + totalValue() + " (Customs fee: $ " + customsFee + ")";
	}
	

}
