package com.springExemple.DAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class DAOImpl implements IDao{
	
	public int getValue(){
		return 52;
	}
	
	
}
