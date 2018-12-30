package cn.itcast.booktest;

import cn.itcast.booktest.domain.Employee1;

public class StaticTest {

	public static void main(String[] args) {
		//创建数组容器
		Employee1[] staff = new Employee1[3];
		
		staff[0] = new Employee1("Tom",40000);
		staff[1] = new Employee1("Dick",60000);
		staff[2] = new Employee1("Harry",650000);
		
		for (Employee1 e : staff) {
			e.setId();
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		}
		int n = Employee1.getNextId();
		System.out.println("Next available id="+n);
		
	}

}
