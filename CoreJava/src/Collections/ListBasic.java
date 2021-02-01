package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListBasic {

	static List<String> list = new ArrayList<>();

	public static void main(String[] args) throws NotFoundException {
		// List Interface
		// list type data structure
		// can have duplicate values.
		// List interface is implemented by the classes ArrayList, LinkedList,
		// Vector, and Stack

		// 1.ArrayList
		// It uses a dynamic array to store the duplicate element of different
		// data types.
		// The ArrayList class maintains the insertion order and is
		// non-synchronized
		// The elements stored in the ArrayList class can be randomly accessed
		// Initial capacity id 10 then on (n*3)+1
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(null);

		Iterator<Integer> itr1 = l1.iterator();
		System.out.print("ArrayList l1 :");
		while (itr1.hasNext()) {
			System.out.print(itr1.next() + " ");
		}

		// uses a doubly linked list internally to store the elements.
		// can store the duplicate elements
		// maintains the insertion order and is not synchronized
		// the manipulation is fast because no shifting is required
		// slow at access by index.
		List<Integer> l2 = new LinkedList<Integer>();

		// Vector uses a dynamic array to store the data elements. It is similar
		// to ArrayList
		// It is synchronized
		List<Integer> l3 = new Vector<Integer>();

		// The stack is the subclass of Vector.
		// implements the last-in-first-out data structure, i.e., Stack
		Stack<Integer> l4 = new Stack<Integer>();
		l4.push(10);
		l4.push(20);
		l4.push(40);
		System.out.println();
		System.out.println("Stack peek method " + l4.peek());

		Iterator<Integer> itr4 = l4.iterator();
		System.out.print("Stack l4 :");
		while (itr4.hasNext()) {
			System.out.print(itr4.next() + " ");
		}

		/* Basic functionalities of List collection */

		// Since Java 9, you can create a List collection from a fixed set of
		// elements by using
		// the factory method List.of(e1, e2, e3…)
		// List<Integer> listNumbers = List.of(1, 2, 3, 4, 5, 6);

		// Since Java 10, you can shorten the declaration of a
		// List collection by using the var reserved word like this:
		// var employees = new ArrayList<Employee>();

		List<String> list = new ArrayList<>();
		// OK to add Strings:
		list.add("One");
		list.add("Two");
		list.add("Three");

		System.out.println("index 2 : " + list.get(2));
		list.set(2, "Delta");
		list.add(3, "Three");
		System.out.println(list);

		list.remove("Delta");
		System.out.println(list);

		if (list.contains("Two")) {
			System.out.println("Contains TWO");
		} else {
			throw new NotFoundException("Not found");
		}

		// Before Java 8, the simplest way to sort out elements in a list is
		// using the Collections.sort() static method which sorts the specified
		// list into ascending order, based on the natural ordering of its
		// elements
		Collections.sort(list);
		System.out.println("After sorting " + list);

		List<String> listStrings = new ArrayList<String>();
		listStrings.add("D");
		listStrings.add("C");
		listStrings.add("E");
		listStrings.add("A");
		listStrings.add("B");
		System.out.println("Before Sorting " + listStrings);
		listStrings.sort(null);
		System.out.println("After Sorting " + listStrings);
		
		// Converting between arrays and list
		List<String> listNames = Arrays.asList("John", "Peter", "Tom", "Mary", "David", "Sam");
		listNames.sort(null);
		System.out.println("ListNames " + listNames);
		
		String[] names = listNames.toArray(new String[listNames.size()]);
		System.out.println(names.toString());

	}
}
