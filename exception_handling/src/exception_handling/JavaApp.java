package exception_handling;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaApp {

	public static void execution() {
		
   //1. ARITHMETIC EXCEPTION	
		int i = 10;
		System.out.println("i is: "+i);
		int j = 0;
		System.out.println("j is: "+j);
		
		try{
		int k = i/j; //new ArithmeticException();
		System.out.println("k is: "+k);
		System.out.println("Trying to do something");
		}
		
		catch(ArithmeticException ae){
			System.out.println(ae);
			System.out.println("Can't Divide any number by Zero!");
		}
		System.out.println("-----------------------------");
	
//---------------------------------------------------------------------------------------------------//
		
   //2. NULL POINTER EXCEPTION
		String s = null;
		try {
			System.out.println(s+ " "+s.length());
		}
		catch(NullPointerException npe) {
			System.out.println("Can't Perform anything on Null");
		}
		System.out.println("-----------------------------");
			
  //-------------------------------------------------------------------------------------------------//

   //3. ARRAY / ARRAYLIST / STRING INDEX EXCEPTION HANDLING	
		try 
		{
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int k = 0 ; k<=5; k++) {
			al.add(k);
		}
		
		for(int k = 0 ; k<=al.size(); k++) {
			System.out.println(al.get(k));
		}
		
		int[] array = new int[5];
		int data = 1;
		for(int k = 0; k<array.length; k++) {
			array[i] = data;
			data++;
			}
		
		String string = "java";
		for(int k = 0; k<string.length(); k++) {
			System.out.println(string.charAt(k));
			}
		}
		catch(Throwable throwable) {
			System.out.println(throwable.toString());
			System.out.println(throwable.getMessage());
			throwable.printStackTrace();
			System.out.println("Exception Handled");
		}
		System.out.println("------------------------------");
		
//---------------------------------------------------------------------------------------------------//
		
   //4. USER INPUT EXCEPTION HANDLING USING SCANNER (TRY-CATCH-FINALLY)
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("Enter Your Id");
			int id =scanner.nextInt();
			System.out.println("Enter Your Name");
			String name = scanner.next();
			System.out.println("Id: "+id);
			System.out.println("Name: "+name);
		}
		catch(Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("Invalid Input");
		}
		finally {
			scanner.close();
			System.out.println("Resource Closed");
		}
		
	}
		
	}


