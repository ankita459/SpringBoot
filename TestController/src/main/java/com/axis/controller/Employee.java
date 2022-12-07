package com.axis.controller;
import com.axis.controller.Employee;

public class Employee {
	private int id;
	private String name;
	private String dept;
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @param id
	 * @param name
	 * @param dept
	 */
	public Employee(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	

}
