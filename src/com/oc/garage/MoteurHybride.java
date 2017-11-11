package com.oc.garage;

public class MoteurHybride extends Moteur {
	private String cylindre = "75 chevaux";
	private double prix = 125.50d;
	
	private TypeMoteur type = TypeMoteur.HYBRIDE;

	public MoteurHybride() {
		// TODO Auto-generated constructor stub
	}

	public MoteurHybride(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
		// TODO Auto-generated constructor stub
	}
	
	public String toString() {
		return '(' + type.getType() +  " " + this.cylindre + " " + this.prix + "€)\n";
	}

}
