package banque.modele.ejb.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name="Compte")
@Inheritance (strategy=InheritanceType.JOINED)
public abstract class Compte implements Serializable
{
	@Id @GeneratedValue
	private long numero;
	
	private double solde;
	
	@ManyToOne
	private Client lstcompte;
	
	public Long getNumero() {
		return numero;
		
	}
	
	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}

	public Compte() {
		super();
	}
	
	public Client getLstcompte() {
		return lstcompte;
	}
	
	public void setLstcompte(Client lstcompte) {
		this.lstcompte = lstcompte;
	}
	
	public Compte(double solde, Client lstcompte) {
		super();
		this.solde = solde;
		this.lstcompte = lstcompte;
	}
	
	
	
	
	
	
}
