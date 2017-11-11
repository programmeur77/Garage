package com.oc.garage;

public class GPS implements Options {
	public String nom = "GPS";
	public double prix = 0d;

	public GPS() {
		// TODO Auto-generated constructor stub
		prix = 280.0d;
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
