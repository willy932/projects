package com.springExemple.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springExemple.SpringExpl.Client;
import com.springExemple.SpringExpl.Utilisateur;
import com.springExemple.metier.IMetier;

public class Presentation2 {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app-context.xml"});
		IMetier metier = (IMetier) context.getBean("metier");
		Client c = (Client)context.getBean("list");
		//Utilisateur u = (Utilisateur)context.getBean("utilisateur");
		//System.out.println(metier.calcul());
		System.out.println(c);
	}

}
