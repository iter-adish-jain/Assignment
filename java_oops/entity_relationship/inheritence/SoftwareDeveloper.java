/**
 * 
 */
package edu.jecrc.sdt.java_oops.entity_relationship.inheritence;

/**
 * 
 */

public final class SoftwareDeveloper extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String branch;
	static String company;
	static {
		department = "Software Development";
		branch = "Jaipur";
		company = "Capgemini";
		city = "Jaipur";
		state = "Rajasthan";
		country = "India";
		
	}
	public void task() {
		System.out.println("Software Development");
	}
	
	public void reverseKT() {
		System.out.println("Explation about Latest Software Development Tools and Technologies.");
	}
	public void SoftwareDeveloperDetails() {
		System.out.println("Software Development Details");
		System.out.println("----------------------------");
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
//		System.out.println("Department : " + department);
//		System.out.println("Branch : " + branch);
//		System.out.println("Company : " + company);
//		System.out.println("Name : " + name);
	}
}



//public class SoftwareDeveloper extends Employee {
//	int id;
//	String name;
//	String designation;
//	double salary;
//	String role;
//	double incentive;
//	
//	static String department;
//	static String branch;;
//	static String company;
//	static {
//		department = "Software Development";
//		branch = "Jaipur";
//		company = "Capgemini";
//		state = "Rajasthan";
//		country = "India";
//	}
//	
//	public void task() {
//		System.out.println("Software Development");
//	}
//	
//	public void reverseKT() {
//		System.out.println("Explanation about latest software development tools and technologies");
//	}
//	
//	public void displaySoftwareDeveloperDetails() {
//		System.out.println("SoftwareDeveloperDetails");
//		System.out.println("------------------------");
//		System.out.println("Id :" +id);
//		System.out.println("Name :" +name);
//	}
//}
