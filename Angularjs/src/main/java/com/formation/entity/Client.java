package com.formation.entity;

import javax.persistence.*;

import org.hibernate.annotations.NamedQuery;

@Entity
@NamedQuery(name="getClient", query="SELECT c FROM Client c")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id ;
	
	private String nom;
	
	private String prenom;
	
	private String tel;
	
	private String mail;

	public Client(String nom, String prenom, String tel, String mail) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.tel = tel;
		this.mail = mail;
	}
	
	
	
	public Client() {
		super();
	}



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

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
