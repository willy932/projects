package com.formation.wikiDao;

import java.sql.SQLException;

import com.formation.wikiModel.User;

public interface UserDao {
	public void addUser(User u) throws ClassNotFoundException, SQLException;
	public void UpdateUser(User u) throws ClassNotFoundException, SQLException;
	public User getUser(int id) throws ClassNotFoundException, SQLException;
}
