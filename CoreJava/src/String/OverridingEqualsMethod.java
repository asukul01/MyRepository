package String;

import java.util.HashSet;
import java.util.Set;

class Student {
	public int id;
	public String name;
	public String house;

	Student(int id, String name, String house) {
		this.id = id;
		this.name = name;
		this.house = house;
	}
	
	Student(int id){
		this.id = id;
	}

	/*@Override
	public boolean equals(Object stu) {
		if (stu instanceof Student) {
			Student s2 = (Student) stu;
			if (this.id == s2.id && this.name.equals(s2.name) && this.house.equals(s2.house)) {
				return true;
			}
		}
		return false;
	}*/
	
	@Override
	public boolean equals(Object stu){
		if(stu instanceof Student){
			Student s2 = (Student) stu;
			if(this.id == s2.id){
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString(){
		String info = "Student info : " + this.id;
		info += " ; " + this.name;
		info += " ; " + this.house;
		return info;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = prime + house.hashCode() + name.hashCode();
		System.out.println("Hashcode of student id " + this.id  + " : " + result );
		return result;
	}	
	
}

public class OverridingEqualsMethod {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sam", "Justice");
		Student s2 = new Student(102, "Mike", "Equality");
		Student s3 = new Student(101, "Sam", "Justice");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println("Equality between s1 and s2 : " + s1.equals(s2));
		System.out.println("Equality between s1 and s3 : " + s1.equals(s3));
		
		
		System.out.println("********************");
		Set<Student> student = new HashSet<>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		student.forEach(st -> System.out.println(st.toString()));
	}
}
