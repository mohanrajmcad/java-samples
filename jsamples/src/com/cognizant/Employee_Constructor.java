package com.cognizant;

public class Employee_Constructor {

	int empId;
	String empName;

	// parameterized constructor with two parameters
	Employee_Constructor(int id, String name) {
		this.empId = id;
		this.empName = name;
	}

	void info() {
		System.out.println("Id: " + empId + " Name: " + empName);
	}

	public static void main(String args[]) {
		Employee_Constructor obj1 = new Employee_Constructor(10245, "Chaitanya");
		Employee_Constructor obj2 = new Employee_Constructor(92232, "Negan");
		obj1.info();
		obj2.info();
	}
}
