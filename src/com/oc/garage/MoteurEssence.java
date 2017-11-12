package com.oc.garage;

public class MoteurEssence extends Moteur {
	private String cylindre = "145 ch";
	private double prix = 145d;
	private Moteur moteur;
	
	private TypeMoteur type = TypeMoteur.ESSENCE;

	public MoteurEssence() {
		// TODO Auto-generated constructor stub
	}

	public MoteurEssence(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	public void mot(Moteur moteur) {
		this.moteur = moteur;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return '(' + type.getType() +  " " + this.cylindre + " " + this.prix + "€)\n";
	}

}
