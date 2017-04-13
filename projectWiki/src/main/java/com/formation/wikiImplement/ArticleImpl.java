package com.formation.wikiImplement;

import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.formation.wikiDao.ArticleDao;
import com.formation.wikiModel.Article;
import com.formation.wikiModel.User;

public class ArticleImpl implements ArticleDao{
	static EntityManager em =null;
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("wikiPU");

	public void addArticle(Article a) {
		em=emf.createEntityManager();
    	em.getTransaction().begin(); //jouvre la connexion avec la base de donnée
    	em.merge(a); // merge= create update 
    	em.getTransaction().commit(); //fermeture de la connexion 
		
	}

	public void updateArticle(Article a) {
		em=emf.createEntityManager();
    	em.getTransaction().begin();
    	em.merge(a);
    	em.getTransaction().commit();
		
	}

	public void deleteArticle(int idArt) {
		em=emf.createEntityManager();
		em.getTransaction().begin();
    	Article art = em.find(Article.class, idArt);
    	em.remove(art);
    	em.getTransaction().commit();
    	
    	
    	
	}

	public void validArticle(Article a) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public void noterArticle(Article a) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
	}

	public List<Article> getArticle() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Article getArticleById(int idArt){
		em=emf.createEntityManager();
    	Article art = em.find(Article.class, idArt);
    	if(art!=null){
    	return art;
    	}
    	else
    	return null;
	}

}
