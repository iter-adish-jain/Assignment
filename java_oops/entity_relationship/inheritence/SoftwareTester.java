/**
 * 
 */
package edu.jecrc.sdt.java_oops.entity_relationship.inheritence;

/**
 * 
 */
public final class SoftwareTester {
	int id;
	String name;
	String designation;
	double salary;
	String role;
	double incentive;
	
	static String department;
	static String branch;;
	static String company;
	static String state;
	static String country;
	static {
		department = "Software Testing";
		branch = "Jaipur";
		company = "Capgemini";
		state = "Rajasthan";
		country = "India";
	}
	
	public void task() {
		System.out.println("Software Testing");
	}
	
	public void reverseKT() {
		System.out.println("Explanation about latest software development tools and technologies");
	}
	
	public void displaySoftwareTesterDetails() {
		System.out.println("SoftwareTesterDetails");
		System.out.println("------------------------");
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
	}
}
