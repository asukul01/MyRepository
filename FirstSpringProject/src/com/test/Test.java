package com.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.bean.DI.Employee;
import com.bean.IOC.Student;

public class Test {
	public static void main(String[] args) {

		// ======================= IOC
		// There are two types of IoC containers. They are:
		// BeanFactory
		// ApplicationContext
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		/*
		 * Student student = (Student) factory.getBean("studentbean");
		 * student.displayInfo();
		 * 
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("applicationContext.xml");
		 * 
		 * Student student1 = (Student) context.getBean("studentbean");
		 * student1.displayInfo();
		 */

		// ======================= DI using

		Employee emp = (Employee) factory.getBean("employeeBean");
		emp.displayInfo();

	}
}
