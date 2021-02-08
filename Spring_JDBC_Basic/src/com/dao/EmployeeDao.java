package com.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.bean.Employee;

public class EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int saveEmployee(Employee e) {
		String query = "insert into emp values('" + e.getId() + "','" + e.getName() + "','" + e.getAge() + "')";
		return jdbcTemplate.update(query);
	}

	public int updateEmployee(Employee e) {
		String query = "update emp set name='" + e.getName() + "',age='" + e.getAge() + "' where id='" + e.getId()
				+ "' ";
		System.out.println(query);
		return jdbcTemplate.update(query);
	}

	public int deleteEmployee(Employee e) {
		String query = "delete from emp where id='" + e.getId() + "' ";
		return jdbcTemplate.update(query);
	}
}
