package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Date dateOfInstallment;
	private Double amount;
	
	
	public Installment(Date dateOfInstallment, Double amount) {
		this.dateOfInstallment = dateOfInstallment;
		this.amount = amount;
	}


	public Date getDateOfInstallment() {
		return dateOfInstallment;
	}


	public void setDateOfInstallment(Date dateOfInstallment) {
		this.dateOfInstallment = dateOfInstallment;
	}


	public Double getAmount() {
		return amount;
	}


	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return sdf.format(dateOfInstallment) + " - " + String.format("%.2f", amount);
	}
	
	
				
}
