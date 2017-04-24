package banque.model.ejb.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import banque.model.ejb.entite.Compte;

@Stateless(mappedName="ejb/maBanqueBean_v2")
public class BanqueBean implements IBanque{
	
	@PersistenceContext (unitName="BanqueEJB")
	private EntityManager em;
	
	private Compte ct;
	@Override
	public Compte ouvrircompte(String name, int solde) {
		ct = new Compte(name, solde);
		em.persist(ct);
		return ct;
	}

	@Override
	public Compte consulterCompte(int id) {
		Compte found = rechercherCompte(id);
		return found;
	}

	@Override
	public void crediterCompte(Compte ct, int flouz) {
		Compte found = rechercherCompte(ct.getId());
		found.setSolde(flouz);
	}

	public Compte rechercherCompte (int numAd) {
		Query req = em.createQuery ("SELECT c FROM Compte c WHERE c.id = :param1");
		req.setParameter ("param1",numAd);
		Compte ad = (Compte) req.getSingleResult();
		return ad;
	}
	
//	public List rechercherComptes (String nomAd) {
//		Query req = em.createQuery ("SELECT c FROM Compte c WHERE c.name = :param1");
//		req.setParameter ("param2",nomAd);
//		List<Compte> res = req.getResultList();
//		return res;
//	}

}
