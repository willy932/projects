package com.springExemple.SpringExpl;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("client")
public class Client {
	private String nom;
	private String prenom;
	
	
	
	
	
	public List<Object> getList() {
		return list;
	}
	
	@Autowired
	private List<Object> list;
	public void setList(List<Object> list) {
		this.list = list;	
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
	public Client(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public Client() {
		super();
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", list=" + list + "]";
	}
	
	
	
}
