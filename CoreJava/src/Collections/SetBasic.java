package Collections;

import java.util.*;
import java.util.stream.Collectors;

public class SetBasic {

	public static void main(String[] args) {

		// It represents the unordered set of elements
		// doesn't allow us to store the duplicate items
		// can store at most one null value in Set
		// Set is implemented by HashSet, LinkedHashSet, and TreeSet

		// represents the collection that uses a hash table for storage
		// It contains unique items.
		Set<String> s1 = new HashSet<String>();
		s1.add("sam");
		s1.add("mike");
		s1.add("charlie");
		s1.add("tango");
		s1.add(null);
		s1.add("tango");

		Iterator<String> itr1 = s1.iterator();
		System.out.println("Hash Set : ");
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}
		System.out.println();
		for (String s : s1) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		s1.forEach(name -> System.out.print(name + " "));
		// represents the LinkedList implementation of Set Interface.
		// contains unique elements
		// It maintains the insertion order and permits null elements.
		Set<String> s2 = new LinkedHashSet<String>();
		s2.add("sam");
		s2.add("mike");
		s2.add("charlie");
		s2.add("tango");
		s2.add(null);
		s2.add("tango");

		Iterator<String> itr2 = s2.iterator();
		System.out.println();
		System.out.println("LinkedHash Set : ");
		while (itr2.hasNext()) {
			System.out.print(itr2.next() + " ");
		}

		for (String s : s1) {
			System.out.print(s + " ");
		}
		System.out.println();
		s2.forEach(names -> System.out.print(names + " "));
		

		// The key characteristic of a SortedSet is that, it sorts elements
		// according to their natural
		// ordering or by a specified comparator
		// Duplicate elements are not allowed.
		// Range view: extracts a portion of the set, i.e. a range.
		// Endpoints: returns the first and the last element in the sorted set.
		// Comparator access: returns the comparator, if an, used to sort the
		// set.
		SortedSet<Integer> setNumbers = new TreeSet<>();

		setNumbers.addAll(Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 0, 9));
		System.out.println();
		System.out.println("Sorted Set: " + setNumbers);

		Set<String> s3 = new TreeSet<String>();

		/* Basic functionalities of Set collection */

		List<Integer> l = Arrays.asList(3, 5, 1, 0, 6, 7, 7, 4, 6, 7, 2, 4, 5, 8, 9, 0, 9);
		System.out.println("List of numbers : " + l);
		Set<Integer> s = new HashSet<>(l);
		System.out.println("unique numbers : " + s);

		System.out.println("Odd numbers : " + l.stream().filter(number -> number % 2 != 0).collect(Collectors.toSet()));

		System.out
				.println("Even Numbers : " + l.stream().filter(number -> number % 2 == 0).collect(Collectors.toSet()));

		Set<String> names = new HashSet<>();
		names.add("Tango");
		names.add("Charlie");
		System.out.println(names.add("Charlie"));
		System.out.println(names.add("Delta"));
		System.out.println("names Set : " + names);
	}
}
