package com.springExemple.SpringExpl;

public class UtilisateurFactory {
	
	public Utilisateur createInstance(String type){
		
		Utilisateur u = new Utilisateur();
		u.setAge("25");
		u.setNom("roger");
		u.setPrenom("yves");
		u.setType(type);
		return u;
		
	}
}
