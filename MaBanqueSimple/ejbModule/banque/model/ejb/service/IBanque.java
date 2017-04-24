package banque.model.ejb.service;

import javax.ejb.Remote;

import banque.model.ejb.entite.Compte;

@Remote
public interface IBanque {
	Compte ouvrircompte(String name, int solde);
	Compte consulterCompte(int id);
	void crediterCompte(Compte ct, int flouz);
}
