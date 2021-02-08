package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
	    EmployeeDao dao=(EmployeeDao)ctx.getBean("edao");  
		
		  int status=dao.saveEmployee(new Employee(107,"Mike",26));
		  System.out.println(status);
		   
	    
		/*
		 * int status=dao.deleteEmployee(new Employee(1007,"Mike",24));
		 * System.out.println(status);
		 */
	}

}
