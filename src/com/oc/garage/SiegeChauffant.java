package com.oc.garage;

public class SiegeChauffant implements Options {
	private String nom = "Siège électrique";
	private double prix = 0.0d;

	public SiegeChauffant() {
		// TODO Auto-generated constructor stub
		prix = 3980d;
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
