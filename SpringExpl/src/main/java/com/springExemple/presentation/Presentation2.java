package com.springExemple.presentation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springExemple.SpringExpl.appConfiguration;
import com.springExemple.metier.IMetier;

public class Presentation2 {
	
	public static void main(String[] args) {
		//ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app-context.xml"});
		
		//MetierImpl metier = new MetierImpl();
		//Client c = (Client)context.getBean("list");
		//Utilisateur u = (Utilisateur)context.getBean("utilisateur");
		//System.out.println(metier.calcul());
		ApplicationContext context=new AnnotationConfigApplicationContext(appConfiguration.class);
		IMetier metier = (IMetier) context.getBean("metier");
		System.out.println(metier.calcul());
	
	    // Explicitly closing application 
	    // context to force bean cleanup
	    //context.registerShutdownHook();
	}

}
