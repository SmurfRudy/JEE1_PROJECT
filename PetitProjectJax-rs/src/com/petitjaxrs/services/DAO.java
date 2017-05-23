package com.petitjaxrs.services;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	private List<User> users;

	public DAO() {
		this.users = new ArrayList<>();
	}
	
	public List<User> getAllUsers() {
		return this.users;
	}
	
	public User getUser(String login) {
		User userFound = null;
		for (User user : this.users) {
			if (user.getLogin().equalsIgnoreCase(login)) {
				userFound = user;
			}
		}
		return userFound;
	}
	
	public void addUser(User user) {
		if (user != null && user.getNom() != null && user.getPrenom() != null) {
			this.users.add(user);
		}
	}
	
	
	
}
