package cn.itcast.booktest.domain;

import java.util.Random;

public class Employee3 {
	private static int nextId;
	
	private int id;
	private String name = "";//实例域初始化
	private double salary;
	
	//静态初始代码块
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);//设置nextId的值是0到10000之间的随机数
	}
	
	//初始代码块
	{
		id = nextId;
		nextId++;
	}
	
	//下面是三个重载的构造器
	public Employee3(String n,double s) {
		name = n;
		salary = s;
	}
	
	public Employee3(double s) {
		this("Employee3 #"+nextId,s);//调用重载构造器1
	}
	
	//默认构造器
	public Employee3() {
		//name初始化为"";
		//salary初始化为0;
		//id初始化为初始代码块
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}
	
	
}
