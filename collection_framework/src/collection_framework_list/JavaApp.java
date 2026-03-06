package collection_framework_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.HashSet;


public class JavaApp {
	public static void execution() {
	    ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(1); al1.add(2); al1.add(3);
		al1.add(-4); al1.add(5); al1.add(-6);
		System.out.println(al1);
		
		ArrayList<Integer> al2 = (ArrayList<Integer>) al1.clone();
		System.out.println(al2);
		
		System.out.println(al1.equals(al2));
		
		System.out.println(al1.hashCode());
		System.out.println(al2.hashCode());
		System.out.println("-------------------------");
		
		//---------------------------------------------------------//
		
		//Product File
		ArrayList al = new ArrayList();
		al.add(null); al.add(null); al.add(null);
		al.add(10); al.add(10); al.add(10);
		al.add(true); al.add('j');
		al.add(12.34); al.add("java");
		al.add(new Product(1, "Apsara", "Pencil", 29.99));
		System.out.println(al);
		System.out.println("--------------------------");
		
		//---------------------------------------------------------//
		ArrayList<Integer> al3 = new ArrayList<Integer>();
		al3.add(1); al3.add(2); al3.add(3); al3.add(4); al3.add(5);
		al3.add(2,33);
		al3.addFirst(111);
		al3.addLast(333);
		Iterator<Integer> iterator = al3.iterator();;
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		System.out.println("--------------------------");
		
		//-----------------------------------------------------------//
		
		ArrayList<Integer> all = new ArrayList<Integer>();

		all.add(1); all.add(2); all.add(3); all.add(4); all.add(5);
		System.out.println(all);
		Iterator<Integer> iterator1 = all.iterator();
		System.out.println("Forward");

		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		ListIterator<Integer> listIterator = all.listIterator(5);
				System.out.println("Backward");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}
		System.out.println("------------------------------"); 
		
		//------------------------------------------------------------//
		
		//HashTable
		//1. :
		HashSet<Character> hs1 = new HashSet<Character>();
		hs1.add('a'); hs1.add('I'); hs1.add('*'); hs1.add('5'); hs1.add('W'); hs1.add('e');
		System.out.println(hs1);
		
		HashSet<Character> hs2 = (HashSet<Character>) hs1.clone();
		System.out.println(hs2);
		
		System.out.println(hs1.equals(hs2));
		
		System.out.println(hs1.hashCode());
		System.out.println(hs2.hashCode());
		System.out.println("---------------------------------");
		
		//2. :
		HashSet hs = new HashSet();
		hs.add(null);hs.add(null);hs.add(null);
		hs.add(10);
		hs.add(true);
		hs.add('j');
		hs.add(12.34);
		hs.add("java");
		hs.add(new Product(1, "Apsara", "Pen", 29.99));
		System.out.println(hs);
		System.out.println("--------------------------------");
		
		//3. :
		HashSet<Character> hs3 = new HashSet<Character>();
		hs.add('A');hs.add('z');hs.add('+');
		hs.add('4');hs.add('Z');hs.add('a');
		
		Iterator<Character> iterator3 = hs3.iterator();
		while(iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
		hs3.remove('+');
		System.out.println(hs3);
		System.out.println("--------------------------------");

		//-----------------------------------------------------------//
		
		//Question:
/*		WAP to Design and Develop the Java Application to achieve the following business logic 
		implementation of performing CRUD Operations on Student Objects as per the end user's choice        */
		

	}
}
