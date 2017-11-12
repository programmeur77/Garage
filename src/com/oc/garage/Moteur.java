package com.oc.garage;

import java.io.Serializable;

public abstract class Moteur implements Serializable {
	protected TypeMoteur type = TypeMoteur.DIESEL;
	protected String cylindre;
	protected double prix;
	
	public Moteur() {}
	
	public Moteur(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	abstract public void mot(Moteur moteur);
	
}
