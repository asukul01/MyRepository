package Basic;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	private int id;
	private String name;
	private int age;

	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age;
	}

}

class AgeComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		if (e1.getAge() > e2.getAge()) {
			return 1;
		} else if (e1.getAge() < e2.getAge()) {
			return -1;
		} else
			return 0;
	}

}

public class ReadFromTable_Basic {

	public static void main(String[] args) throws Exception {
		String query = "Select * from emp";
		List<Employee> emp = new ArrayList<>();
		ResultSet rs;
		try {
			rs = Oracle_Connection.getStatementObject().executeQuery(query);
			while (rs.next()) {
				Employee e = new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3));
				emp.add(e);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			Oracle_Connection.closeConnection();
		}

		System.out.println("The employee list -->");
		emp.forEach(employee -> System.out.println(employee.toString()));

		System.out.println("============================");
		System.out.println("Sorting wrt age -->");
		Collections.sort(emp, new AgeComparator());
		emp.forEach(employee -> System.out.println(employee.toString()));
	}

}
