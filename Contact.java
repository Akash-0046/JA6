package com;

public class Contact implements Comparable<Contact>{
	private String name;
	private String email;
	private Contact.Gender gender;
	private Long phoneNumber;



	public Contact(String name, String email, Gender gender ) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;	
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Contact.Gender getGender() {
		return gender;
	}


	public void setGender(Contact.Gender gender) {
		this.gender = gender;
	}


	public Long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", gender=" + gender + ", phoneNumber=" + phoneNumber
				+ "]";
	}


	enum Gender{
		MALE,FEMALE;
	}


	@Override
	public int compareTo(Contact o) {

		return o.getPhoneNumber().compareTo(this.getPhoneNumber());
	}



}
