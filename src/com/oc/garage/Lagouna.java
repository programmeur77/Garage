package com.oc.garage;

public class Lagouna extends Vehicule {
	private String nom;
	private double prix;
	
	private Marque nomMarque;

	public Lagouna() {
		// TODO Auto-generated constructor stub
		nom = "Laguna";
		prix = 12325.45d;
		nomMarque = Marque.RENO;
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
