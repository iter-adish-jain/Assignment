/**
 * 
 */
package edu.jecrc.sdt.java_oops.entity_relationship.inheritence;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
      
		
		//CHILD CLASS PART
/*      System.out.println(Child.sv);
		Child.sm();
		
		Child child = new Child();
    	System.out.println(child.nsv);
		child.nsm(); 
*/
		
	//--------------------------------------------------------------	
		
		
		//softwareDeveloper area
		SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper();
		softwareDeveloper.id = 1;
		softwareDeveloper.name = "Raja";
		softwareDeveloper.displaySoftwareDeveloperDetails();

		
	//--------------------------------------------------------------
/*
		//Student Area
		Student student = new Student(1,"Raja","raja@gmail.com",9878923456l); 
		student.displayStudentDetails();
*/		
   //---------------------------------------------------------------------
		
		//parent child area
//		Parent parent = new Parent();
//		System.out.println(parent instanceof Parent);
//		System.out.println(parent instanceof Child);
//		
//		Child child = new Child();
//		System.out.println(child instanceof Child);
//		System.out.println(child instanceof Parent);
		
		
	}
}
