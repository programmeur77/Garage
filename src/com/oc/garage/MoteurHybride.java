package com.oc.garage;

public class MoteurHybride extends Moteur {
	private String cylindre = "75 chevaux";
	private double prix = 125.50d;
	private Moteur moteur;
	
	private TypeMoteur type = TypeMoteur.HYBRIDE;

	public MoteurHybride() {
		// TODO Auto-generated constructor stub
	}

	public MoteurHybride(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
		// TODO Auto-generated constructor stub
	}
	
	public void mot(Moteur moteur) {
		this.moteur = moteur;
	}
	
	public String toString() {
		return '(' + type.getType() +  " " + this.cylindre + " " + this.prix + "€)\n";
	}
	
	public TypeMoteur getTypeMoteur() {
		return type;
	}
	
	public String getCylindre() {
		return cylindre;
	}
	
	public double getPrix() {
		return prix;
	}

}
