package com.springExemple.presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Method;
import java.util.Scanner;

import com.springExemple.DAO.DAOImpl;
import com.springExemple.DAO.IDao;
import com.springExemple.metier.IMetier;
import com.springExemple.metier.MetierImpl;

public class Presentation {
	
	public static void main(String[] args) {
		//MetierImpl metier = new MetierImpl();
		//IDao dao = new DAOImpl();
		//metier.setDao(dao);

		try {
			Scanner sc = new Scanner(new File("config.txt"));
			String daoName = sc.next();
			String metiername = sc.next();
			
			Class daoClass = Class.forName(daoName);
			Class metierClass = Class.forName(metiername);
			
			IDao dao = (IDao) daoClass.newInstance();
			IMetier metier = (IMetier) metierClass.newInstance();
			
			Method method = metierClass.getMethod("setDao", new Class[]{IDao.class});
			method.invoke(metier, new Object[]{dao});
			
			System.out.println(metier.calcul());
			
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		
		
		
	}

}
