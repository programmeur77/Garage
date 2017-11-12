package com.oc.garage;

public class D4 extends Vehicule {
	private String nom = "";
	private double prix = 0.0d;
	
	private Marque nomMarque;

	public D4() {
		// TODO Auto-generated constructor stub
		nom = "D4";
		prix = 12324.38d;
		nomMarque = Marque.TROEN;
	}

	public String getNom() {
		return nom;
	}
	
	public double getPrix() {
		return prix;
	}
	
	public Marque getNomMarque() {
		return nomMarque;
	}
}
