package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentSortByIdUsingComparable implements Comparable<StudentSortByIdUsingComparable> {
	int id;
	String name;

	public StudentSortByIdUsingComparable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(StudentSortByIdUsingComparable o) {
		if (this.id == o.id) {
			return 0;
		} else if (this.id > o.id) {
			return 1;
		} else
			return -1;
	}

	public String toString() {
		String data = "Student Info : " + this.id;
		data += " - " + this.name;
		return data;

	}

}

class IdComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		StudentSortByIdUsingComparable s1 = (StudentSortByIdUsingComparable) o1;
		StudentSortByIdUsingComparable s2 = (StudentSortByIdUsingComparable) o2;

		if (s1.id == s2.id) {
			return 0;
		} else if (s1.id > s2.id) {
			return 1;
		} else
			return -1;
	}
}

class NameComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		StudentSortByIdUsingComparable s1 = (StudentSortByIdUsingComparable) o1;
		StudentSortByIdUsingComparable s2 = (StudentSortByIdUsingComparable) o2;

		return s1.name.compareTo(s2.name);
	}

}

public class SortUserDefined {

	public static void main(String[] args) {
		List<StudentSortByIdUsingComparable> stdList = new ArrayList<>();
		stdList.add(new StudentSortByIdUsingComparable(101, "Sam"));
		stdList.add(new StudentSortByIdUsingComparable(102, "Mike"));
		stdList.add(new StudentSortByIdUsingComparable(106, "John"));
		stdList.add(new StudentSortByIdUsingComparable(110, "Peter"));
		stdList.add(new StudentSortByIdUsingComparable(100, "Aeron"));
		stdList.add(new StudentSortByIdUsingComparable(190, "Patrick"));

		Collections.sort(stdList);
		System.out.println("Sort by Id impelementing Comparable(WRT Id) :");
		stdList.forEach(stu -> System.out.println(stu.toString()));
		System.out.println("======================");
		Collections.sort(stdList, new NameComparator());
		System.out.println("Sort by Name impelementing Comparator(WRT Name) :");
		stdList.forEach(stu -> System.out.println(stu.toString()));
	}

}
