package cn.itcast.booktest;

import cn.itcast.booktest.domain.Employee3;

public class ConstructorTest {

	public static void main(String[] args) {
		//��������
		Employee3[] staff = new Employee3[3];
		
		staff[0] = new Employee3("Harry",40000);
		staff[1] = new Employee3(60000);
		staff[2] = new Employee3();
		
		//���Ա����Ϣ
		for (Employee3 e : staff) {
			System.out.println("name="+e.getName()+",id="+e.getId()+",salary="+e.getSalary());
		}
	}

}
