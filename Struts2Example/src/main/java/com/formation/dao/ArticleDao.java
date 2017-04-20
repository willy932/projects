package com.formation.dao;

import java.util.List;

import com.formation.beans.Article;

public interface ArticleDao {
	
	public boolean SaveOrUpdateArticle(Article a);
	public boolean deleteArticle(Integer id);
	public List<Article> getAllArticles();
	public Article getArticleById(Integer id);

}
