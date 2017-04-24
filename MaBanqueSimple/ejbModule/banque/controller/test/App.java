package banque.controller.test;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import banque.model.ejb.entite.Compte;
import banque.model.ejb.service.IBanque;

public class App {

	public static void main(String[] args) throws NamingException {
		IBanque ib;
		
		Context ctx = new InitialContext();
		ib = (IBanque) ctx.lookup("ejb/maBanqueBean_v2");
		ib.ouvrircompte("ert", 3500);
		System.out.println(ib);
	}

}
