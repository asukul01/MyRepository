package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

		EmployeeDao dao = (EmployeeDao) ctx.getBean("edao");
		EmployeeDao empDao = (EmployeeDao) ctx.getBean("empdao");

		boolean status = dao.saveEmployeeByPreparedStatement(new Employee(123, "Eli", 23));
		System.out.println(status);
		
		empDao.saveEmployeeByUsingNPJdbcT(new Employee(127, "Micheal", 25));

		System.out.println("Using ResultSet Extractor ==>");
		dao.getAllEmployees().forEach(emp -> System.out.println(emp.toString()));

		/*
		 * int status=dao.deleteEmployee(new Employee(1007,"Mike",24));
		 * System.out.println(status);
		 */
		System.out.println("Using RowMapper ==>");
		dao.getAllEmployeesRowMapper().forEach(emp -> System.out.println(emp.toString()));
	}

}
