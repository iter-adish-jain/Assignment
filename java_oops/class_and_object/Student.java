/**
 * 
 */
package edu.jecrc.sdt.java_oops.class_and_object;

/**
 * 
 */
public class Student {
	
	// Data Members (Instance Variables)
    int id;
    String name;
    String mailid;
    long contactNumber;
    
    
    Student(int id, String name, String mailId, long contactNumber){
    	this.id = id;
    	this.name = name;
    	this.mailid = mailId;
    	this.contactNumber = contactNumber;
    }
    static String city;
    static String state;
    static String country;
    static {
    	Student.city = "Jaipur";
    	Student.state = "Rajasthen";
    	Student.country = "India";
    }

    public void displayStudentDetails() {
        System.out.println("Student Details");
        System.out.println("-----------------");
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
        System.out.println("Mail Id : " + mailid);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("City : " + city);
        System.out.println("State : " + state);
        System.out.println("Country : " + country);
        System.out.println();
    } 
    }

