package com.formation.wikiModel;

import javax.persistence.*;

@Entity
@Table(name="user")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="Role")
@DiscriminatorValue("Normal")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private int id;
	
	@Column(name="login",nullable=false)
	private String login;
	
	@Column(name="password",nullable=false)
	private String password;
	
	@Column(name="mail",nullable=false)
	private String mail;
	
	@Column(name="statut")
	private int statut;
	
	
	public int getStatut() {
		return statut;
	}
	public void setStatut(int statut) {
		this.statut = statut;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public User(String login, String password, String mail) {
		super();
		this.login = login;
		this.password = password;
		this.mail = mail;
	}
	public User(int id, String login, String password, String mail) {
		super();
		this.id = id;
		this.login = login;
		this.password = password;
		this.mail = mail;
	}
	public User() {
		super();
	}
	
	
	
	
}
