package HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class JavaApp {

	public static void execution() {
		HashMap<Integer, Double> hm1 =  new HashMap<Integer, Double>();
		hm1.put(1, 11.11);hm1.put(-2, -22.22);hm1.put(3, 33.33);
		hm1.put(-4, -44.44);hm1.put(5, 55.55);hm1.put(-6, -66.66);
		System.out.println(hm1);
		
		HashMap<Integer, Double> hm2 = (HashMap<Integer, Double>) hm1.clone();
		System.out.println(hm2);
		
		System.out.println(hm1.equals(hm2));
		
		System.out.println(hm1.hashCode());
		System.out.println(hm2.hashCode());
		System.out.println("---------------------------");
		
//-----------------------------------------------------------------------------------//
		HashMap hm3 = new HashMap();
		hm3.put(1, 11.11);
		hm3.put(-2, -22.22);
		hm3.put(3, 33.33);
		hm3.put(-4, -44.44);
		hm3.put(null, false);
		hm3.put(false, null);
		System.out.println(hm3);
		System.out.println("----------------------------");
		
//-----------------------------------------------------------------------------------//
		
		HashMap<Integer, Double> hm = new HashMap<Integer, Double>();
		hm.put(1, 11.11);
		hm.put(-2, -22.22);
		hm.put(3, 33.33);
		hm.put(-4, -44.44);
		Set<Integer> keys = hm.keySet();
		System.out.println(keys);
		Collection<Double> values = hm.values();
		System.out.println(values);
		System.out.println(hm);
		hm.replace(3, 30.30);
		hm.remove(-4);
		System.out.println(hm);
		
	}

}
