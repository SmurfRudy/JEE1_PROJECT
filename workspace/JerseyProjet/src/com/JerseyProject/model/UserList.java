package com.JerseyProject.model;

import java.util.Map;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class UserList {
	private Map<String,User> userMap;
	
	public UserList(){
		this.userMap =new HashMap<String,>
	}
	
	public void addUser(User u){
		this.userList.put(u.getLogin(), u);
	}
	
	public void getUser(String login){
		return this.userList.put(u.getLogin(), u);
	}
	
	public List<User> getUserList(){
		List<User> userList =new ArrayList<User>();
		for (Entry<String,User> entry:this.userMap)
	}

}
