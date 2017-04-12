package com.formation.wikiControle;

import java.sql.*;

public class Article {
	
	public int idArt;
	public String titre;
	public Date date;
	public String image;
	public String description;
	public String contenu;
	public int getIdArt() {
		return idArt;
	}
	public void setIdArt(int idArt) {
		this.idArt = idArt;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Article(String titre,String image, String description, String contenu) {
		super();
		this.titre = titre;
		this.image = image;
		this.description = description;
		this.contenu = contenu;
	}
	public Article(int idArt,Date date, String titre, String image, String description, String contenu) {
		super();
		this.idArt = idArt;
		this.date = date;
		this.titre = titre;
		this.image = image;
		this.description = description;
		this.contenu = contenu;
	}
	public Article() {
		super();
	}
	
	
}
