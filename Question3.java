package com;
import java.util.TreeSet;
import java.util.Scanner;
import java.util.Set;

public class Question3{

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Choose the following options in which manner you need to sort");
		System.out.println("1.name  2.id  3.salary   4.department");
		int choose = scanner.nextInt();
		//char choose = scanner.next().charAt(0);
		Set<Employee> s = null;
		if(choose == 1) {
			s = new TreeSet<>(new nameComp());	
		}
		else if(choose == 2) {
			s = new TreeSet<>(new idComp());
		}
		else if(choose == 3) {
			s = new TreeSet<>(new salComp());
		}
		else if(choose == 4) {
			s = new TreeSet<>(new depComp());
		}
		s.add(new Employee (123,"Kirito",50000,"Sword Art Online"));
		s.add(new Employee (456,"Luffy",60000,"One Piece"));
		s.add(new Employee (789,"Naruto",30000,"Leaf Village"));
		s.add(new Employee(111,"Goku",90000,"Dragon Ball Z"));
		s.add(new Employee(222,"Tanjiro",10000,"Deamon Slayer"));
		for(Employee temp:s) {
			System.out.println(temp);
			
		}


	}
}

	


