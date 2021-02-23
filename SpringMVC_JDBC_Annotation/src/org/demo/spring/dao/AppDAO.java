package org.demo.spring.dao;

import java.util.List;

import org.demo.spring.model.User;

public interface AppDAO {
	public List<User> listUsers();
}
