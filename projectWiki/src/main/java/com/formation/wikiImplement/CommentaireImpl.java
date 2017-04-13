package com.formation.wikiImplement;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.formation.wikiDao.CommentaireDao;
import com.formation.wikiModel.Commentaire;

public class CommentaireImpl implements CommentaireDao {

	static EntityManager em =null;
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("wikiPU");
	
	public void addCommentaire(Commentaire c1) {
		em=emf.createEntityManager();
    	em.getTransaction().begin(); //jouvre la connexion avec la base de donnée
    	em.merge(c1); // merge= create update 
    	em.getTransaction().commit(); //fermeture de la connexion 
		
	}

	public void updateCommentaire(int id) {
		// TODO Auto-generated method stub
		
	}

	public void deleteCommentaire(Commentaire c) {
		// TODO Auto-generated method stub
		
	}

}
