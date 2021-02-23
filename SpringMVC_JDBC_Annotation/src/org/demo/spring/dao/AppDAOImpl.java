package org.demo.spring.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.demo.spring.model.User;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource = null;

	public AppDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<User> listUsers() {
		String query = "Select * from users";
		List<User> listUser = new ArrayList<User>();

		Connection con = null;

		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User(rs.getInt(1), rs.getString(2), rs.getString(3));
				listUser.add(user);
			}
			rs.close();
			con.close();
			return listUser;
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return null;
	}

	public void addUser(User user) {
		String query = "Insert into users " + "(USER_ID, USERNAME, email) values (?,?,?)";

		Connection con = null;
		try {
			con = dataSource.getConnection();
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, "user_id.nextval");
			ps.setString(2, user.getUserName());
			ps.setString(3, user.getEmail());

			con.close();
			ps.close();

			ps.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
