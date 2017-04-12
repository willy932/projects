package com.springExemple.metier;

import org.springframework.beans.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Service;
import javax.annotation.*;

import com.springExemple.DAO.DAOImpl;
import com.springExemple.DAO.IDao;

@Service
public class MetierImpl implements IMetier {
	
	@Autowired
	IDao dao; 
	
	public MetierImpl() {
	}
	
	
	public int calcul(){
		
		int temp = dao.getValue();
		return 5*temp;
	}
	
	
	@PostConstruct
	public void init(){
		//System.out.println("PostConstruct is called...");
	}
	  public void destroy(){
	   // System.out.println("Cleaning up");
	  }

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	

}
