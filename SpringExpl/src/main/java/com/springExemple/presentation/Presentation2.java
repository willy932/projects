package com.springExemple.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springExemple.SpringExpl.Client;
import com.springExemple.SpringExpl.Utilisateur;
import com.springExemple.metier.IMetier;
import com.springExemple.metier.MetierImpl;

public class Presentation2 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app-context.xml"});
		//IMetier metier = (IMetier) context.getBean("metier");
		MetierImpl metier = new MetierImpl();
		//Client c = (Client)context.getBean("list");
		//Utilisateur u = (Utilisateur)context.getBean("utilisateur");
		//System.out.println(metier.calcul());
		System.out.println(metier.calcul());
	}

}
