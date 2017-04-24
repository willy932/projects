package banque.model.ejb.entite;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Compte implements Serializable{
	@Id
	@GeneratedValue
	private int id;
	
	private String name;
	private int solde;
	
	public Compte() {
		super();
	}
	
	public Compte(String name, int solde) {
		super();
		this.name = name;
		this.solde = solde;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSolde() {
		return solde;
	}

	public void setSolde(int solde) {
		this.solde += solde;
	}
	
	
}
