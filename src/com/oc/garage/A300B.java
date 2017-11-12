package com.oc.garage;

public class A300B extends Vehicule {
	
	private String nom = "";
	private double prix = 0.0d;
	
	private Marque nomMarque;

	public A300B() {
		// TODO Auto-generated constructor stub
		nom = "A300B";
		prix = 456890.45;
		nomMarque = Marque.PIGEO;
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
