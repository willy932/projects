package com.formation.wikiAction;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.*;

import com.formation.wikiControle.Article;
import com.formation.wikiDao.ArticleDao;

public class GestionArticle {
	
	public int idArt;
	public String titre;
	public Date date;
	public String image;
	public String description;
	public String contenu;
public ArrayList<Article> lst;
	
	
	public ArrayList<Article> getLst() {
		return lst;
	}

	public void setLst(ArrayList<Article> lst) {
		this.lst = lst;
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

	public GestionArticle() {
		super();
	}
	
	public String execute() {
		
		ArticleDao ad = new ArticleDao();
		Article art = new Article(titre, image, description, contenu);
		ad.AjouterArticle(art);
		
		if(ad.AjouterArticle(art)){
			lst=(ArrayList<Article>) ad.getArticle();
		return "success";
		}
		else{
			return "failed";
		}
		
	
	}
}
