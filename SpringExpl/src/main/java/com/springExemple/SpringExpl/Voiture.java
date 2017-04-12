package com.springExemple.SpringExpl;

public class Voiture {
 private String marque;
 private String type;

 public String getMarque() {
	return marque;
}
public void setMarque(String marque) {
	this.marque = marque;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Voiture(String marque, String type) {
	super();
	this.marque = marque;
	this.type = type;
}
public Voiture() {
	super();
}
@Override
public String toString() {
	return "Voiture [marque=" + marque + ", type=" + type + "]";
}
 

 
}
