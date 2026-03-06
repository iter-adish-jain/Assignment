/**
 * 
 */
package edu.jecrc.sdt.java_oops.entity_relationship.inheritence;

/**
 * 
 */
public sealed class Employee permits SoftwareDeveloper, SoftwareTester {
	int id;
	String name;
	String mailid;
	long contactNumber;
	static String city;
	static String state;
	static String country;
	public void entry() {
		System.out.println("Employee enter into the campus.");
	}
	public void login() {
		System.out.println("Employee logged into the office.");
	}
	public void logout() {
		System.out.println("Employee logged out from the office.");
	}
	public void exit() {
		System.out.println("Employee exits from the campus.");
	}
}

//public sealed class Employee permits SoftwareDeveloper, SoftwareTester {
//	int id ;
//	String name; 
//	String mailId;
//	long contactNumber;
//	static String city;
//	static String state;
//	static String country;
//
//	public void entry() {
//		System.out.println("Employee Entered Into the Campus");
//		
//	}
//
//	public void login() {
//		System.out.println("Employee Logged Into the Office");
//		
//	}
//	
//	public void meeting() {
//		System.out.println("Employee is Attending the Meeting");
//		
//	}
//
//	public void logout() {
//		System.out.println("Employee Logged Out From the Office");
//		
//	}
//
//	public void exit() {
//		System.out.println("Employee Exited From the Campus");
//		
//	}
//
//}

