/**
 * 
 */
package edu.jecrc.sdt.java_oops.class_and_object;

/**
 * 
 */
public class Members {
	public static int sv;
	public static void sm() {
		System.out.println("static sm()");
	}
	static {
		System.out.println("static bci");
	}
	
	public String nsv;
	public void nsm() {
		System.out.println("non static nsm()");
	}
	{
		System.out.println("non static bci");
	}
	

}