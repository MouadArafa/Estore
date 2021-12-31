package com.model;

public class Client {

	int id;
	String nom,prenom,log,pass,role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getLog() {
		return log;
	}
	public void setLog(String log) {
		this.log = log;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Client(String nom, String prenom, String log, String pass, String role) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.log = log;
		this.pass = pass;
		this.role = role;
	}
	
	
	
}
