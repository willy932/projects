package banque.modele.ejb.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import banque.modele.ejb.entite.Client;
import banque.modele.ejb.entite.Compte;
import banque.modele.ejb.entite.CompteCourant;
import banque.modele.ejb.entite.CompteDevise;

@Stateless(mappedName = "ejb/maBanqueBean_v3")
public class BanqueBean implements IBanque 
{
	@PersistenceContext (unitName= "MaBanqueUnit")
	EntityManager em;
	
	@Override
	public long ouvrirCompteCourant (int numClient, double soldeInitial, double retraitMax) throws Exception {		
		Client client = em.find(Client.class, numClient);
		if (client != null) {
			Compte compte = new CompteCourant(soldeInitial, client , retraitMax);
			em.persist(compte);
			return compte.getNumero();
		}
		throw new Exception ("Client inexistant : " + numClient);
	}
	
	@Override
	public long ouvrirCompteDevise (int numClient, double soldeInitial, String devise, double tauxChangeEuro) throws Exception {
		Client client = em.find(Client.class, numClient);
		if (client != null) {
			Compte compte = new CompteDevise(soldeInitial, client , devise, tauxChangeEuro);
			em.persist(compte);
			return compte.getNumero();
		}
		throw new Exception ("Client inexistant : " + numClient);
	}


	@Override
	public Compte searchCompteByNo(long numero) 
	{
		Compte compte = em.find (Compte.class, numero);
		return compte;
	}

	@Override
	public Compte crediterCompte(long numero, double credit) 
	{
		double crediter;
		Compte compte = em.find (Compte.class, numero);
		double sol = compte.getSolde();
		crediter = credit + sol;
		compte.setSolde(crediter);
		em.persist(compte);
		return compte;
	}

	@Override
	public Compte debiterCompte(long numero, double debit) {
		double debiter;
		Compte compte = em.find (Compte.class, numero);
		double sol = compte.getSolde();
		debiter = sol - debit;
		compte.setSolde(debiter);
		em.persist(compte);
		return compte;
	}

	
	
}
