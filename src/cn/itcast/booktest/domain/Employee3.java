package cn.itcast.booktest.domain;

import java.util.Random;

public class Employee3 {
	private static int nextId;
	
	private int id;
	private String name = "";//ʵ�����ʼ��
	private double salary;
	
	//��̬��ʼ�����
	static {
		Random generator = new Random();
		nextId = generator.nextInt(10000);//����nextId��ֵ��0��10000֮��������
	}
	
	//��ʼ�����
	{
		id = nextId;
		nextId++;
	}
	
	//�������������صĹ�����
	public Employee3(String n,double s) {
		name = n;
		salary = s;
	}
	
	public Employee3(double s) {
		this("Employee3 #"+nextId,s);//�������ع�����1
	}
	
	//Ĭ�Ϲ�����
	public Employee3() {
		//name��ʼ��Ϊ"";
		//salary��ʼ��Ϊ0;
		//id��ʼ��Ϊ��ʼ�����
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
