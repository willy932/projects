package com.formation.service;

import java.util.List;

import com.formation.beans.Article;

public interface ArticleService {

	public boolean EnregistrerArticle(Article a);
	public boolean SupprimerArticle(Integer id);
	public List<Article> getAllArticles();
	public Article getArticleById(Integer id);

}
