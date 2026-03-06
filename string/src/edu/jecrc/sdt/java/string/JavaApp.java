package edu.jecrc.sdt.java.string;

public class JavaApp {
	public static void execution() {
		
		//String
		String string1 = "java";
		System.out.println(string1);
		
     	String string2 = new String("java");
		System.out.println(string2);
		
		System.out.println(string1.equals(string2));
		
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		System.out.println("--------------");
		
		
		
		//StringBuffer
		StringBuffer f1 = new StringBuffer("java");
		System.out.println(f1);
		
		StringBuffer f2 = new StringBuffer("java");
		System.out.println(f2);
		
		System.out.println(f1.equals(f2)); //check only for address
		
		System.out.println(f1.hashCode());
		System.out.println(f2.hashCode());
		System.out.println("--------------");
		
		//StringBuilder
		StringBuilder b1 = new StringBuilder("c++");
		System.out.println(b1);
		
		StringBuilder b2 = new StringBuilder("c++");
		System.out.println(b2);
		
		System.out.println(b1.equals(b2));
		
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println("--------------");
		
/* string buffer and string builder both are mutable
   SBuffer thread safe 
   SBuilder	not thread safe  */
		
//Mutation:-----------------------------------
		//1. Immutable : if object is created in String Literal pool area
		String st1 ="va";
		System.out.println(st1);
		
		String st2 ="va";
		System.out.println(st2);
		
		String st3 = st1.concat(st2);
		System.out.println(st3);
		
		System.out.println(st1 == st2); //check for content
		System.out.println(st2 == st3);
		System.out.println(st1 == st3);
		System.out.println("--------------");
		
		//2. Mutable: if object is created in Heap area
		StringBuffer sf1 = new StringBuffer("ja");
		System.out.println(sf1);
		
		StringBuffer sf2 = sf1.append("va");
		System.out.println(sf2);
		
		System.out.println(sf1 == sf2);
		System.out.println("--------------");
		
//---------------------------------------------------------------------//
		
		String s1 = "java";
		System.out.println(s1);
		
		String s2 = s1.toUpperCase();
		System.out.println(s2);
		
		String s3 = "CORE";
		System.out.println(s3);
		
		String s4 = s3.toLowerCase();
		System.out.println(s4);
		System.out.println("--------------");
		
//---------------------------------------------------------------------//
		
		String str1 = "09AZaz";
		System.out.println(str1);
		for(int i = 0; i<str1.length(); i++) {
			System.out.println(str1.charAt(i)+" - "+str1.codePointAt(i));
		}
		System.out.println("--------------");
		
//---------------------------------------------------------------------//
		//array to String
		char[] array = new char[4];
		array[0] = 'j'; array[1] = 'a';
		array[2] = 'v'; array[3] = 'a';
		for(char c : array) System.out.println(c);
		String string = new String(array);
		System.out.println(string);
		System.out.println("--------------");
		
		//string to array
		String d1 = "core";
		System.out.println(d1);
		char[] arr =  d1.toCharArray();
		for(char c : arr) System.out.println(c);
		System.out.println("--------------");
		
		

	
	}
}
