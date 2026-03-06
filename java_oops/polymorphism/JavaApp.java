package edu.jecrc.sdt.java_oops.polymorphism;

public class JavaApp {
	public static void execution() {
	
	//BasicCalculator example
	System.out.println("//*---------------*---------------*---------------*---------------*//");
	System.out.println(BasicCalculator.addition(1,2));
	System.out.println(BasicCalculator.addition(10,20,30));
	
	//----------------------------------------------------//
	
	//Career
	System.out.println("//*---------------*---------------*---------------*---------------*//");
	Child child = new Child();
	child.Career();
	
	//-------------------------------------//
	
	//Student
	System.out.println("//*---------------*---------------*---------------*---------------*//");
	Student std1 = new Student("Anant");
	Student std2 = new Student("Anurag", "anurag@gmail.com");
	Student student = new Student("Adish", "adish@gmail.com", 9351987539l);
	std1.displayStudentDetails();
	std2.displayStudentDetails();
	student.displayStudentDetails();
	}
}
