/**
 * 
 */
package edu.jecrc.sdt.java_oops.encapsulation;

/**
 * 
 */
public class JavaApp {
	public static void execution() {
		Student st = new Student();
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getMailid());
		System.out.println(st.getContactNumber());
		
		st.setId(101);
		st.setName("Ansh");
		st.setMailid("ansh@gmail.com");
		st.setContactNumber(8100252232l);
		
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getMailid());
		System.out.println(st.getContactNumber());
	}
}
