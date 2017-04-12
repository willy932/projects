package com.springExemple.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.springExemple.DAO.IDao;

@Service("metier")
public class MetierImpl implements IMetier {
	
	@Autowired
	@Qualifier("dao")
	IDao dao; 

	public MetierImpl() {
	}

	public int calcul(){
		
		int temp = dao.getValue();
		return 5*temp;
	}

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	

}
