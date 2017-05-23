package com.petitjaxrs.services;


public class User {

	private String nom;
	private String prenom;
	private String login;

	public User(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public User() {
		this.nom = null;
		this.prenom = null;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
	public String toString(){
		return "Login : " + login + " Prénom : " + prenom + " Nom : "+ nom + " \n";
	}
}
