package com.springExemple.SpringExpl;

public class Utilisateur {
	
	private String nom;
	private String prenom;
	private String age ;
	private String type;
	
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Utilisateur(String nom, String prenom, String age, String type) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.type = type;
	}
	
	
	
	public Utilisateur() {
		super();
	}
	@Override
	public String toString() {
		return "Utilisateur [nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", type=" + type + "]";
	}
	
	
}
