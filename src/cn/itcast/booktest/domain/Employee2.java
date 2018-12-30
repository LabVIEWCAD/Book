package cn.itcast.booktest.domain;

public class Employee2 {
	private String name;
	private double salary;
	
	public Employee2(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void raiseSalary(double byPercent) {
		double raise = salary*byPercent/100;
		salary+=raise;
	}
}
