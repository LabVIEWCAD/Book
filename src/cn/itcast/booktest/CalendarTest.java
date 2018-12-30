package cn.itcast.booktest;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.now();
		int month = date.getMonthValue();
		int today = date.getDayOfMonth();
		
		date = date.minusDays(today-1);//设置为月份的起始天
		DayOfWeek weekday = date.getDayOfWeek();
		int value = weekday.getValue();//1=Monday....7=Sunday
		
		System.out.println("Mon Tue Wen Thu Fri Sat Sun");
		for (int i = 0; i < value; i++) {
			System.out.print("  ");
		}
		while (date.getMonthValue()==today) {
			System.out.printf("%3d",date.getDayOfMonth());
			if (date.getDayOfMonth()==today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			if (date.getDayOfWeek().getValue()==1) {
				System.out.println();
			}
		}
		if (date.getDayOfWeek().getValue()!=1) {
			System.out.println();
		}
	}

}
