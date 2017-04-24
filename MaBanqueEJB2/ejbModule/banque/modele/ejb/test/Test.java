package banque.modele.ejb.test;

import javax.naming.Context;
import javax.naming.InitialContext;

import banque.modele.ejb.service.IBanque;

public class Test {

	public static void main(String[] args) throws Exception 
	{
		Context ctx = new InitialContext();
		IBanque banque = (IBanque) ctx.lookup("ejb/maBanqueBean_v3");
		//long numero = banque.ouvrirCompte("Ali", 123123);
		//System.out.println("Compte créer sous le numero: " + numero);
		
		//banque.searchCompteByNo(52);
		//System.out.println(banque.searchCompteByNo(52));
		
		/*System.out.println(banque.searchCompteByNo(52));
		banque.crediterCompte(52, 786);
		System.out.println(banque.searchCompteByNo(52));*/
		
		/*System.out.println(banque.searchCompteByNo(101));
		banque.debiterCompte(101, 2);
		System.out.println(banque.searchCompteByNo(101));*/
	}

}
