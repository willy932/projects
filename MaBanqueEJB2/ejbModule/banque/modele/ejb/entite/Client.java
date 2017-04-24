package banque.modele.ejb.entite;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name="Client")
public class Client implements Serializable
{
	@Id @GeneratedValue	
	private int numero;
	
	private String nom;
	private String adresse;
	
	@OneToMany(mappedBy="lstcompte", cascade=CascadeType.REMOVE, fetch=FetchType.EAGER)
	private List<Compte> comptes = new ArrayList<Compte>();

	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Compte> getComptes() {
		return comptes;
	}

	public void setComptes(List<Compte> comptes) {
		this.comptes = comptes;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String adresse) {
		super();
		this.nom = nom;
		this.adresse = adresse;
	}
	
	
	
}
