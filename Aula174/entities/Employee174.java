package entities;

public class Employee174 implements Comparable<Employee174>{
	
	private String name;
	private Double salary;
	
	public Employee174(String name, Double salary) {
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee174 o) {
		return -salary.compareTo(o.getSalary()); //negativar o retorno faz a ordem ficar decrescente
	}
	
	
	
	

}
