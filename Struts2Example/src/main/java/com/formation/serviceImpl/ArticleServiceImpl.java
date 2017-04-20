package com.formation.serviceImpl;

import java.util.List;

import com.formation.beans.Article;
import com.formation.dao.ArticleDao;
import com.formation.service.ArticleService;

public class ArticleServiceImpl implements ArticleService{

	private ArticleDao dao;
	
	public boolean EnregistrerArticle(Article a) {
		if(dao.SaveOrUpdateArticle(a))
			return true;
		else
			return false;
	}

	public boolean SupprimerArticle(Integer id) {
		if(dao.deleteArticle(id))
			return true;
		else
			return false;
	}

	public List<Article> getAllArticles() {
		return dao.getAllArticles();
	}

	public Article getArticleById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArticleDao getDao() {
		return dao;
	}

	public void setDao(ArticleDao dao) {
		this.dao = dao;
	}

	public ArticleServiceImpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
