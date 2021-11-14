package com;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import com.Contact.Gender;

public class Question1 {

	public static void main(String[] args) {

		Map<Long, Contact> c=new TreeMap<>();
		c.put(9897648752L, new Contact("IronMan", "Ironman.123@com",Contact.Gender.MALE));
		c.put(9891234752L, new Contact("Thor", "Thor.123@com", Contact.Gender.MALE));
		c.put(9891245852L, new Contact("CaptainAmerica", "Captainamerica.123@com", Contact.Gender.MALE));
		c.put(9878946952L, new Contact("Hulk", "Hulk.123@com", Contact.Gender.MALE));
		c.put(9147852752L, new Contact("BlackWidow", "BlackWidow.123@com", Contact.Gender.FEMALE));
		c.put(9812547852L, new Contact("Hawkeye", "Hawheye.123@com", Contact.Gender.MALE));

		Set<Map.Entry<Long, Contact> > entries= c.entrySet();
		for (Entry<Long, Contact> entry : entries) {
			System.out.println("Keys: "+entry.getKey());
		}
		
		System.out.println("==================================================");
		
		for (Entry<Long, Contact> entry : entries) {
			System.out.println("Values: "+entry.getValue());	
		}
		
		System.out.println("==================================================");
		
		for (Entry<Long, Contact> entry : entries) {
			System.out.println("Key Value Pairs: "+entry.getKey()+"\n"+entry.getValue());
			
		}
	}

}
