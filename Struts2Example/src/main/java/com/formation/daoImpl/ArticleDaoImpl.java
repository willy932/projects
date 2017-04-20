package com.formation.daoImpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.formation.beans.Article;
import com.formation.dao.ArticleDao;

@Transactional
public class ArticleDaoImpl implements ArticleDao{

	private SessionFactory sessionFactory;
	
	public boolean SaveOrUpdateArticle(Article a) {

		Session session=sessionFactory.openSession();
		session.getTransaction().begin();;
		session.saveOrUpdate(a);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public boolean deleteArticle(Integer id) {
		
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		Article art=(Article) session.get(Article.class, id);
		session.delete(art);
		session.getTransaction().commit();
		session.close();
		return true;
	}

	public List<Article> getAllArticles() {
		Session session=sessionFactory.openSession();
		List<Article> maliste =(List<Article>)session.getNamedQuery("Article.findAll").list();
		session.close();
		return maliste;
	}

	public Article getArticleById(Integer id) {
		return null;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
