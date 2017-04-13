package com.formation.controler;

import java.sql.SQLException;
import java.util.Date;

import com.formation.wikiDao.ArticleDao;
import com.formation.wikiImplement.ArticleImpl;
import com.formation.wikiModel.Article;

public class ArticleControl {
	int idArt;
	String titre;
	String image;
	String description;
	String contenu;
	
	
	
	public String getTitre() {
		return titre;
	}


	public int getIdArt() {
	return idArt;
	}


	public void setIdArt(int idArt) {
	this.idArt = idArt;
	}


	public void setTitre(String titre) {
		this.titre = titre;
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



	public String execute() throws ClassNotFoundException, SQLException {
		
		ArticleDao ad = new ArticleImpl();
		Article art = new Article(titre, image, description, contenu);
		art.setDate(new Date());
		ad.addArticle(art);
		
			return "success";
		
	}
}
