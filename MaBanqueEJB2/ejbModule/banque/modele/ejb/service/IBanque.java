package banque.modele.ejb.service;

import java.util.List;

import javax.ejb.Remote;

import banque.modele.ejb.entite.Compte;

@Remote
public interface IBanque 
{
			public long ouvrirCompteCourant(int numClient, double soldeInitial, double retraitMax) throws Exception;
			public long ouvrirCompteDevise(int numClient, double soldeInitial, String devise, double tauxChangeEuro) throws Exception;
			public Compte searchCompteByNo(long numero);
			public Compte crediterCompte(long numero, double credit);
			public Compte debiterCompte(long numero, double debit);
}
