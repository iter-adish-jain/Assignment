package edu.jecrc.sdt_java.array;
import java.util.Scanner;

public class JavaApp {
	public static void execution() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of 1D Array");
		int size = scanner.nextInt();
		int[] array = new int[size];
		for(int i = 0; i < array.length; i++) {
			System.out.println("Enter the Integer Type Element at "+i+" Index");
			array[i] = scanner.nextInt();
		}
		
		for(int i : array) {
			System.out.println(i);
		}
		scanner.close();
	}
/*
		int [] array = new int [5]; //declaration and instanciation
		System.out.println(array);
		System.out.println(array.length);
		int data = 1;
		for(int i = 0; i < array.length; i++) {
			array[i] = data;
			data++;
		}
		for(int i : array) {
			System.out.println(i);
		}
*/
		
		
			
}
