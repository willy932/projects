package com.formation.wikiModel;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.*;

import javax.persistence.*;


import com.formation.wikiDao.ArticleDao;
import com.formation.wikiImplement.ArticleImpl;

@Entity
@Table(name="article")
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="idart", unique=true, nullable=false)
	int idArt;
	
	@Column(name="titre", nullable=false)
	 private String titre;
	
	@Column(name="date",nullable=false)
	private Date date;
	
	@Column(name="image", nullable=false)
	private String image;
	
	@Column(name="description",nullable=false)
	private String description;
	
	@Column(name="contenu", nullable=false)
	private String contenu;
	
	@Column(name="valide")
	private int valide;
	
	
	public int getValide() {
		return valide;
	}
	public void setValide(int valide) {
		this.valide = valide;
	}
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
	public void setDate(Date date2) {
		this.date = date2;
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
	public Article(int idArt, String titre, Date date, String image, String description, String contenu) {
		super();
		this.idArt = idArt;
		this.titre = titre;
		this.date = date;
		this.image = image;
		this.description = description;
		this.contenu = contenu;
	}
	public Article(String titre,Date date, String image, String description, String contenu) {
		super();
		this.titre = titre;
		this.date = date;
		this.image = image;
		this.description = description;
		this.contenu = contenu;
	}
	
	public Article(String titre, String image, String description, String contenu) {
		super();
		this.titre = titre;
		this.date = date;
		this.image = image;
		this.description = description;
		this.contenu = contenu;
		
	}
	public Article() {
		super();
	}
	
	
	
}
