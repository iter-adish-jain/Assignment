package edu.jecrc.sdt.java_oops.entity_relationship.inheritence;

public class Student {
	final int id;
	final String name;
	final String mailId;
	final long contactNumber;
	
	public Student(int id, String name, String mailId, long contactNumber) {
		super();
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}

	final static String city;
	final static String state;
	final static String country;
	static {
		city ="Jaipur";
		state ="Rajasthan";
		country = "India";
	}

	public void displayStudentDetails() {
		System.out.println("Student Details");
		System.out.println("-------------------");
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Mail Id:"+mailId);
		System.out.println("Contact NUmber:"+contactNumber);
		System.out.println("City:"+city);
		System.out.println("State:"+state);
		System.out.println("Country:"+country);
		System.out.println();
}
}