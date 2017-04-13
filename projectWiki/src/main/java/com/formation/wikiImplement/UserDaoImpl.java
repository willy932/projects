package com.formation.wikiImplement;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.formation.wikiDao.UserDao;
import com.formation.wikiModel.User;

public class UserDaoImpl implements UserDao {
	static EntityManager em =null;
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("wikiPU");
	
	public void addUser(User u)  {
		// TODO Auto-generated method stub
		
		em=emf.createEntityManager();
    	em.getTransaction().begin(); //jouvre la connexion avec la base de donnée
    	em.merge(u); // merge= create update 
    	em.getTransaction().commit(); //fermeture de la connexion
	}

	public void UpdateUser(User u)  {
		// TODO Auto-generated method stub
		em=emf.createEntityManager();
    	em.getTransaction().begin();
    	em.merge(u);
    	em.getTransaction().commit();
    	
	}

	public User getUser(int id) {
		
		em=emf.createEntityManager();
    	User c = em.find(User.class, id);
    	if(c!=null){
    	return c;
    	}
    	else
    	return null;
    	
		
	}

}
