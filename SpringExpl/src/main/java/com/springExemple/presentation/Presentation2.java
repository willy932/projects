package com.springExemple.presentation;



import org.apache.commons.logging.impl.Log4JLogger;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springExemple.SpringExpl.appConfiguration;
import com.springExemple.metier.IMetier;

public class Presentation2 {
	final static Logger Log = Logger.getLogger(Presentation2.class);
	public static void main(String[] args) {
		try{
			if(Log.isDebugEnabled()){
				Log.debug("avant changement");
			}
		
		
		
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"app-context.xml"});
		
		//MetierImpl metier = new MetierImpl();
		//Client c = (Client)context.getBean("list");
		//Utilisateur u = (Utilisateur)context.getBean("utilisateur");
		//System.out.println(metier.calcul());
		//ApplicationContext context=new AnnotationConfigApplicationContext(appConfiguration.class);
		IMetier metier = (IMetier) context.getBean("metier");
		Log.debug("apres");
		Log.info("Calcul() :"+metier.calcul());
		
	    // Explicitly closing application 
	    // context to force bean cleanup
	    //context.registerShutdownHook();
		}
		catch(Exception e){
			Log.error("erreur", e);
		}
	}

}
