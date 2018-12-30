package cn.itcast.booktest;

import cn.itcast.booktest.domain.Emloyee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建容器存储Employee对象
		Emloyee[] staff = new Emloyee[3];
		
		staff[0] = new Emloyee("ouji",75000,1987,12,15);
		staff[1] = new Emloyee("xiaoquan",50000,1989,10,1);
		staff[2] = new Emloyee("laowu",40000,1990,3,15);
		
		//没人提薪5%
		for (Emloyee e : staff) {
			e.raiseSalary(5);
		}
		
		//输出每个人的信息
		for (Emloyee e : staff) {
			System.out.println("name:"+e.getName()+",salary:"+e.getSalary()+",hireday:"+e.getHireday());
		}
	}

}
