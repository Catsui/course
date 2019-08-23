package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Double totalValue;
	private Date date;
	private Integer number;
	
	private List<Installment> installments = new ArrayList<>();
	
	

	public Contract(Double totalValue, Date date, Integer number) {
		this.totalValue = totalValue;
		this.date = date;
		this.number = number;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public void addInstallment(Installment installment) {
		installments.add(installment);	
	}
	
	public void removeInstallment(Installment installment) {
		installments.remove(installment);
	}

	public List<Installment> getInstallments() {
		return installments;
	}
	
	
	
	

}
