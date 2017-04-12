package com.springExemple.SpringExpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springExemple.DAO.DAOImpl;
import com.springExemple.metier.MetierImpl;

@Configuration
public class appConfiguration {

	@Bean
	public MetierImpl metier() {
		return new MetierImpl();
	}
	
	@Bean
	 public DAOImpl dao(){
		 return new DAOImpl();
	 }
}
