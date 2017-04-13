package com.formation.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.formation.dao.ClientDao;
import com.formation.entity.Client;

public class CLientImpl implements ClientDao{
	static EntityManager em =null;
	public static EntityManagerFactory emf = Persistence.createEntityManagerFactory("wikiPU");
	
	public boolean InsertClient(Client c) {
		em=emf.createEntityManager();
    	em.getTransaction().begin(); //jouvre la connexion avec la base de donnée
    	em.merge(c); // merge= create update 
    	em.getTransaction().commit(); //fermeture de la connexion 
		return true;
	}

	public List<Client> getListCLient() {
		// TODO Auto-generated method stub
		return (List<Client>) em.createNamedQuery("getClient").getResultList();
	}
	

}
