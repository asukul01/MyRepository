package Collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class mapBasic {
	
	
	public static void main(String[] args) {

		// A map contains values on the basis of key, i.e. key and value pair.
		// Each key and value pair is known as an entry
		// A Map contains unique keys, but can have duplicate values
		// A Map is useful if you have to search, update or delete elements on the basis of a key.
		
		// Java HashMap is non synchronized.
		// Java HashMap maintains no order.
		// The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
		Map<Integer, String> map = new HashMap<>();
		map.put(101,  "Sam");
		map.put(102,  "Mike");
		map.put(103,  "Delta");
		map.put(104,  "Tango");
		
		// Old way 
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> itr = keySet.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			System.out.println(key + " : " + map.get(key));
		}
		
		Collection<String> values = map.values();
		for(String names : values){
			System.out.println(names);
		}
		
		// New way 
		Set<Map.Entry<Integer, String>> set = map.entrySet();
		System.out.println(set);
		for(Map.Entry<Integer, String> entry : set){
			Integer key = entry.getKey();
			String name = entry.getValue();
			
			System.out.println(key + " : " + name);
		}
		
		//lambda exp
		map.forEach((key, name) -> System.out.println(key + " => " + name));
		System.out.println("=====================");
		// comparingByKey
		set.stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("=====================");
		// comparingByKey descending order
		set.stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out:: println);;
		System.out.println("=====================");
		set.stream().sorted(Map.Entry.comparingByValue()).forEach(System.out :: println);
		System.out.println("=====================");
		set.stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out :: println);
		System.out.println("=====================");
		
	}
}
