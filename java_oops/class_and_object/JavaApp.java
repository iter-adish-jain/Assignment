/**
 * 
 */
package edu.jecrc.sdt.java_oops.class_and_object;

/**
 * 
 */
public class JavaApp {

	
	
	public static void execution() {
/*		Student.city = "Jaipur";
		Student.state = "Rajasthan";
		Student.country = "India";     */
		
		Student student1 = new Student(101, "Ansh", "ansh@gmail.com", 8112503220l);
/*		student1.id = 101;
		student1.name = "Ansh";
     	student1.mailid = "ansh@gmail.com";
		student1.contactNumber = 81125032200l;  */
		student1.displayStudentDetails();
		
		Student student2 = new Student(102, "Anuj", "anuj@gmail.com", 8112525420l);
/*		student2.id = 102;
		student2.name = "Anuj";
		student2.mailid = "anuj@gmail.com";
		student2.contactNumber = 81125254200l;  */
		student2.displayStudentDetails();
		
 
	}

}