package banque.modele.ejb.entite;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="numero")
public class CompteDevise extends Compte {
	
	private String devise;
	private double tauxChangeDeviseVersEuro;
	
	public CompteDevise (double solde, Client client, String devise, double tauxChange) {
		super(solde, client);
		this.devise = devise;
		this.tauxChangeDeviseVersEuro = tauxChange;
	}
	
	public String getDevise() {
		return devise;
	}
	public void setDevise(String devise) {
		this.devise = devise;
	}
	public double getTauxChangeDeviseVersEuro() {
		return tauxChangeDeviseVersEuro;
	}
	
	public void setTauxChangeDeviseVersEuro(double tauxChangeDeviseVersEuro) {
		this.tauxChangeDeviseVersEuro = tauxChangeDeviseVersEuro;
	}

	public CompteDevise() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getType()
	{
		return "Compte Devise";
		
	}
}
