package com.formation.wikiModel;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Modérateur")
public class UserMod extends User {

	public UserMod() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserMod(int id, String login, String password, String mail) {
		super(id, login, password, mail);
		// TODO Auto-generated constructor stub
	}

	public UserMod(String login, String password, String mail) {
		super(login, password, mail);
		// TODO Auto-generated constructor stub
	}
	
	
}
