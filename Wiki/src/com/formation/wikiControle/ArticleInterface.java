package com.formation.wikiControle;

import java.sql.SQLException;
import java.util.List;



public interface ArticleInterface {
	public List<Article> getArticle() throws ClassNotFoundException, SQLException;
	public boolean AjouterArticle(Article a) throws ClassNotFoundException, SQLException;
	public boolean SupprimerArticle(int id) throws ClassNotFoundException, SQLException;
	public boolean ModifierArticle(Article l) throws ClassNotFoundException, SQLException;
	public List<Article> RechercherArticle(int id) throws ClassNotFoundException, SQLException;
}
