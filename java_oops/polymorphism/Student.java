package edu.jecrc.sdt.java_oops.polymorphism;

public class Student {
	String name;
	String mailId;
	long contactNumber;

        public Student(String name) {
		this.name = name;
	}

		public Student(String name, String mailId) {
		this(name);
		this.mailId = mailId;
	}

	public Student(String name, String mailId, long contactNumber) {
		this(name, mailId);
		this.contactNumber = contactNumber;
	}
	
	public void displayStudentDetails() {
		
		System.out.println("Student Details");
		System.out.println("...............");
		System.out.println("Name: "+name);
		System.out.println("Mail Id: "+mailId);
		System.out.println("Contact Number: "+contactNumber);
		System.out.println();
		
	}
	
}
