package com;

import java.util.LinkedList;
import java.util.List;
import java.time.LocalDate;
import java.time.Month;

public class Question4 {
	public static void main(String[] args) {
		
		List<LocalDate> date=new LinkedList<>();
		
		date.add(LocalDate.of(2000, Month.MARCH,26));
		date.add(LocalDate.of(2001, Month.MAY,2));
		date.add(LocalDate.of(2002, Month.APRIL,6));
		date.add(LocalDate.of(2004, Month.JUNE,27));
		date.add(LocalDate.of(1996, Month.AUGUST,15));
		date.add(LocalDate.of(2005, Month.NOVEMBER,1));
		date.add(LocalDate.of(2008, Month.JULY,4));
		date.add(LocalDate.of(1992, Month.FEBRUARY,14));
		date.add(LocalDate.of(2009, Month.MARCH,1));
		date.add(LocalDate.of(2012, Month.DECEMBER,5));
		
		for (LocalDate localDate : date) {
			if(localDate.isLeapYear()) {
				System.out.println("Your Date of Birth is "+localDate+" and it was Leap Year");
			}
			else {
				System.out.println("Your Date of Birth is "+localDate+" and it was not Leap Year");
			}
			
		}
	}

}
