package banque.modele.ejb.entite;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="numero")
public class CompteCourant extends Compte {
	
	private double retraitMax;
	
	public CompteCourant (double solde, Client client, double retraitMax) {
		super(solde, client);
		this.retraitMax = retraitMax;
	}
	
	public double getRetraitMax() {
		return retraitMax;
	}

	public void setRetraitMax(double retraitMax) {
		this.retraitMax = retraitMax;
	}

	public CompteCourant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getType()
	{
		return "Compte Courant";
		
	}
}

