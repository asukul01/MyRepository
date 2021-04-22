package com.socialMedia.base.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<User>();
	private static int usersCount = 104;

	static {
		users.add(new User(101, "Aritra", new Date()));
		users.add(new User(102, "Nipa", new Date()));
		users.add(new User(103, "Delta", new Date()));
		users.add(new User(104, "John", new Date()));
	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(usersCount++);
		}
		users.add(user);
		return user;
	}

	public User findUser(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	public User deleteById(int id) {
		Iterator<User> itr = users.listIterator();
		while (itr.hasNext()) {
			User user = itr.next();
			if (user.getId() == id) {
				itr.remove();
				return user;
			}
		}
		return null;
	}
}
