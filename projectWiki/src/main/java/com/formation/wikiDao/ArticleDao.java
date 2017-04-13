package com.formation.wikiDao;

import java.sql.SQLException;
import java.util.List;

import com.formation.wikiModel.Article;

public interface ArticleDao {
	
	public void addArticle(Article a) throws ClassNotFoundException, SQLException; 
	public void updateArticle(Article a) throws ClassNotFoundException, SQLException;
	public void deleteArticle(int idArt) throws ClassNotFoundException, SQLException;
	public void validArticle(Article a) throws ClassNotFoundException, SQLException;
	public void noterArticle(Article a) throws ClassNotFoundException, SQLException;
	public List<Article> getArticle() throws ClassNotFoundException, SQLException;
	public Article getArticleById(int idArt) throws ClassNotFoundException, SQLException;
	
}
