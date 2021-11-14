package com;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Question2 {
	public static void main(String[] args) {
		
		
		Product p1=new Product(1, "Pen");
		Product p2=new Product(2, "Pencil");
		Product p3=new Product(3, "Marker");
		Product p4=new Product(4, "Book");
		Product p5=new Product(5, "paper");
		Product p6=new Product(6, "Ink");
		Product p7=new Product(7, "Hard Disk");
		Product p8=new Product(8, "Pen Drive");
		
		HashSet<Product> tPro=new HashSet<>();
		
		tPro.add(p8);
		tPro.add(p1);
		tPro.add(p2);
		tPro.add(p4);
		tPro.add(p3);
		tPro.add(p5);
		tPro.add(p6);
		tPro.add(p7);
		tPro.add(p8);
		tPro.add(p1);
		
		for (Product product : tPro) {
			System.out.println(product);
			
		}
		
//		Iterator<Product> itr = tPro.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

	}

}
