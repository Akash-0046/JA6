package com;

public class Employee{
	Integer id;
	String name;
	Integer salary;
	String department;
	
	public Employee(int id, String name, int salary, String department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getSalary() {
		return salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String toString() {
		return "ID: "+this.getId()+" Name: "+this.getName()+" Salary: "+this.getSalary()+" Department: "+this.getDepartment();
	}

	

	
	
}
