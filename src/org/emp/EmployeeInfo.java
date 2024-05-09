package org.emp;

public class EmployeeInfo {
	
	private void empId() {
		
		System.out.println("2001");
	}
	
	private void empName() {
		
		System.out.println("YOGARAJ");
	}
	
	private void empDob() {
		
		System.out.println("17-03-2001");
	}
	
	private void empPhone() {
		
		System.out.println("9790322296");

	}
	
	private void empEmail() {
		
		System.out.println("spyogarajmech@gmail.com");

	}
	
	private void empAddress() {
		
		System.out.println("Paramathi Velur");

	}
	
	private void empNative() {
		
		System.out.println("Paramathi Velur");

	}
	
	private void empSalary() {
		
		System.out.println("346285");

	}
	
	public static void main(String[] args) {
		
		EmployeeInfo e=new EmployeeInfo();
		
		e.empAddress();
		e.empDob();
		e.empEmail();
		e.empId();
		e.empName();
		e.empPhone();
		e.empNative();
		e.empSalary();
		
		
	}

}
