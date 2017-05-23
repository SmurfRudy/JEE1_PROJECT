package com.JerseyProject.model;

public class User {
	private String lastName="";
	private String surName="";
	private String login="";
	private String pwd="";
	private String preference="";
	private int age=-1;
	
	public User() {
	}
	
	public User(String surName,String lastName,String login,String pwd, String preference,int age ) {
	this.surName=surName;
	}
	
	public String getPwd(){
		return this.pwd;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
}
