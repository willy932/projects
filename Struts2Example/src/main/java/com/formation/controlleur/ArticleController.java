package com.formation.controlleur;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.formation.beans.Article;
import com.formation.service.ArticleService;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

@Controller
public class ArticleController extends ActionSupport{
	
	final static Logger logger = Logger.getLogger(ArticleController.class);
	private static final long serialVersionUID = 1L;
	@Autowired
	private ArticleService service;
	private Integer id;
	private String titre;
	private String description;
	private String image;
	private String contents;
	private String status;
	public List<Article> articles=new ArrayList<Article>();

	public String execute() {
		return Action.SUCCESS;
    }
		public String getAllArticles(){
			articles=service.getAllArticles();
			return Action.SUCCESS;
		}
	public String InsertArticle(){
		try{	
			Article article=new Article(id,titre, new Date(), description, image, contents, 0);
			service.EnregistrerArticle(article);
			status="true";

	}catch (Exception e) {
		logger.error("Erreur lors du traitement des articles", e);
	}
		return Action.SUCCESS;
	}
	
	public String deleteArticle(){
		try{	
			service.SupprimerArticle(id);
			status="true";

	}catch (Exception e) {
		logger.error("Erreur lors du traitement de l'articles", e);
	}
		return Action.SUCCESS;
	}

//	public ArticleService getService() {
//		return service;
//	}
//
	public void setService(ArticleService service) {
		this.service = service;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

	public ArticleController() {
	}


	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}


	

	

}
