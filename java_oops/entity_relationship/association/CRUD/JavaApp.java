/**
 * 
 */
package edu.jecrc.sdt.java_oops.entity_relationship.association.CRUD;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Student student = new Student(1,"Raja","raja@gmail.com", 9696652312l);
		student.displayStudentDetails();
		
		Project project = new Project(1, "Flight Rservation System", "AI Based Java App");
		
		student.createProject(project);
		student.readProject();
		student.updateProject(1, "Train Reservation System", "Spring AI Based Java web App");
		
		student.readProject();
		student.deleteProject(1);
		
		
	}
}
