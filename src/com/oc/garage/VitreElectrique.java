package com.oc.garage;

public class VitreElectrique implements Options {
	private double prix = 0.0d;
	private String nom = "Vitre Electrique";

	public VitreElectrique() {
		// TODO Auto-generated constructor stub
		prix = 256.67d;
	}

	@Override
	public double getPrix() {
		// TODO Auto-generated method stub
		return prix;
	}
	
	public String toString() {
		return '(' + this.nom + " " + this.prix + "€)";
	}

}
