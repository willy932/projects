package com.formation.wikiModel;

import javax.persistence.*;

@Entity 
@Table(name="commentaire")
public class Commentaire {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id", unique=true, nullable=false)
	private int id;
	
	@Column(name="contenuC")
	private String contenu;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Commentaire(int id, String contenu) {
		super();
		this.id = id;
		this.contenu = contenu;
	}

	public Commentaire(String contenu) {
		super();
		this.contenu = contenu;
	}

	public Commentaire() {
		super();
	}
	
	
}
