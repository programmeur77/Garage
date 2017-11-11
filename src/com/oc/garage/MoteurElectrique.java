package com.oc.garage;

public class MoteurElectrique extends Moteur {
	private String cylindre = "";
	private double prix = 125d;
	
	private TypeMoteur type = TypeMoteur.ELECTRIQUE;

	public MoteurElectrique() {
		// TODO Auto-generated constructor stub
	}

	public MoteurElectrique(String cylindre, double prix) {
		this.cylindre = cylindre;
		this.prix = prix;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return '(' + type.getType() +  " " + this.cylindre + " " + this.prix + "€)\n";
	}

}
