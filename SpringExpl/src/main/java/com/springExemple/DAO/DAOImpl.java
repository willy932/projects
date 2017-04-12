package com.springExemple.DAO;

import org.springframework.stereotype.Repository;

@Repository("dao")
public class DAOImpl implements IDao{
	
	public int getValue(){
		return 50;
	}

}
