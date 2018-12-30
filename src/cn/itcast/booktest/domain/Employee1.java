package cn.itcast.booktest.domain;

public class Employee1 {
	private static int nextId = 1;
	
	private String name;
	private double salary;
	private int id;
	
	public Employee1(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = 0;
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

	public int getId() {
		return id;
	}

	public void setId() {
		id = nextId;
		nextId++;
	}
	
	public static int getNextId() {
		return nextId;
	}
	
	public static void main(String[] args) {
		Employee1 e = new Employee1("Harry",50000);
		System.out.println(e.getName()+" "+e.getSalary());
	}
}
