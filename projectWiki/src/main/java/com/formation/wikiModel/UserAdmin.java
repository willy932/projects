package com.formation.wikiModel;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Administrateur")
public class UserAdmin extends User{

	public UserAdmin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserAdmin(int id, String login, String password, String mail) {
		super(id, login, password, mail);
		// TODO Auto-generated constructor stub
	}

	public UserAdmin(String login, String password, String mail) {
		super(login, password, mail);
		// TODO Auto-generated constructor stub
	}

	
	
}
