package com.formation.beans;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@NamedQueries({
	@NamedQuery(name="Article.findAll", query="SELECT a FROM Article a"),	
}) 
@Table(name="article")
public class Article {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer Id;
	private String titre;
	private Date dateCreation;
	private String description;
	private String image;
	private String contents;
	private Integer statusValidite;
	
	
	public Article() {
		super();
	}


	public Article(String titre, Date dateCreation, String description,String image, String contents, Integer status) {
		super();
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.description = description;
		this.image = image;
		this.contents = contents;
		this.statusValidite = status;
	}

	
	public Article(Integer id, String titre, Date dateCreation, String description, String image, String contents,
			Integer statusValidite) {
		super();
		Id = id;
		this.titre = titre;
		this.dateCreation = dateCreation;
		this.description = description;
		this.image = image;
		this.contents = contents;
		this.statusValidite = statusValidite;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public Date getDateCreation() {
		return dateCreation;
	}


	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getContents() {
		return contents;
	}


	public void setContents(String contents) {
		this.contents = contents;
	}


	

	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public Integer getStatusValidite() {
		return statusValidite;
	}


	public void setStatusValidite(Integer statusValidite) {
		this.statusValidite = statusValidite;
	}


	@Override
	public String toString() {
		return "Article [Id=" + Id + ", titre=" + titre + ", dateCreation=" + dateCreation + ", description="
				+ description + ", image=" + image + ", contents=" + contents + ", statusValidite=" + statusValidite
				+ "]";
	}


	
	
	
}
