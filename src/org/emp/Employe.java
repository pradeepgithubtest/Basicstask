package org.emp;

public class Employe {
	private void empId(int age) {
		System.out.println(age);
		
	}
	private void empId(String name) {
		System.out.println(name);
		
	}private void empId(long phno) {
		System.out.println(phno);
		
	}
	
	public static void main(String[] args) {
		Employe a = new Employe();
		a.empId(12);
		a.empId("Pradeep Guna");
		a.empId(98765479l);
	}

}
