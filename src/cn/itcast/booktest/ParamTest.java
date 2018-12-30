package cn.itcast.booktest;

import cn.itcast.booktest.domain.Employee2;

public class ParamTest {

	public static void main(String[] args) {
		/*
		 * ��ϰ1�����������޸Ļ����������͵Ĳ���
		 */
		System.out.println("Test tripleValue:");
		double percent = 10;
		System.out.println("Before: percent="+percent);
		tripleValue(percent);
		System.out.println("After: percent="+percent);
		
		/*
		 * ��ϰ2���������Ըı���������״̬
		 */
		System.out.println("\nTesting tripleSalary:");
		Employee2 harry = new Employee2("Harry",50000);
		System.out.println("Before: salary="+harry.getSalary());
		tripleSalary(harry);
		System.out.println("After: salary="+harry.getSalary());
		
		/*
		 * ��ϰ3�����������ö����������һ���µĶ���
		 */
		System.out.println("\nTesting swap:");
		Employee2 a = new Employee2("Alice",70000);
		Employee2 b = new Employee2("Bob",60000);
		System.out.println("Before: a="+a.getName());
		System.out.println("Before: b="+b.getName());
		swap(a,b);
		System.out.println("After: a="+a.getName());
		System.out.println("After: b="+b.getName());
	}

	public static void swap(Employee2 x, Employee2 y) {
		// TODO Auto-generated method stub
		Employee2 temp = x;
		x=y;
		y=temp;
		System.out.println("End of Method: x="+x.getName());
		System.out.println("End of Method: y="+y.getName());
	}

	public static void tripleSalary(Employee2 x) {
		// TODO Auto-generated method stub
		x.raiseSalary(200);
		System.out.println("End of Method: salary="+x.getSalary());
	}

	public static void tripleValue(double x) {
		// TODO Auto-generated method stub
		x=3*x;
		System.out.println("End of Method: x="+x);
	}

}
