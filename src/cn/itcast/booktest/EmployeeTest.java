package cn.itcast.booktest;

import cn.itcast.booktest.domain.Emloyee;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���������洢Employee����
		Emloyee[] staff = new Emloyee[3];
		
		staff[0] = new Emloyee("ouji",75000,1987,12,15);
		staff[1] = new Emloyee("xiaoquan",50000,1989,10,1);
		staff[2] = new Emloyee("laowu",40000,1990,3,15);
		
		//û����н5%
		for (Emloyee e : staff) {
			e.raiseSalary(5);
		}
		
		//���ÿ���˵���Ϣ
		for (Emloyee e : staff) {
			System.out.println("name:"+e.getName()+",salary:"+e.getSalary()+",hireday:"+e.getHireday());
		}
	}

}
