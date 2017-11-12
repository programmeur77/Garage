package com.oc.garage;

import java.io.Serializable;

public class Climatisation implements Options, Serializable {
	private String nom = "Climatisation";
	private double prix = 0.0d;

	public Climatisation() {
		// TODO Auto-generated constructor stub
		prix = 2670.56d;
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
