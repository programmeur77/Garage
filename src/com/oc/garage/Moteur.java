package com.oc.garage;

public abstract class Moteur {
	protected TypeMoteur type;
	protected String cylindre;
	protected double prix;
	
	public Moteur() {}
	
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	abstract public String toString();
}
