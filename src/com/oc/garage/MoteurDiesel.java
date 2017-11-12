package com.oc.garage;

public class MoteurDiesel extends Moteur {
	private String cylindre = "125 ch";
	private double prix = 125d;
	private Moteur moteur;
	
	private TypeMoteur type = TypeMoteur.DIESEL;

	public MoteurDiesel() {
		// TODO Auto-generated constructor stub
	}

	public MoteurDiesel(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	public void mot(Moteur moteur) {
		this.moteur = moteur;
		
	}
	
	public TypeMoteur getTypeMoteur() {
		return this.type;
	}
	
	public String getCylindre() {
		return this.cylindre;
	}
	
	public double getPrix() {
		return this.prix;
	}
	public String toString() {
		// TODO Auto-generated method stub
		return '(' + type.getType() +  " " + this.cylindre + " " + this.prix + "€)\n";
	}

}
