package com.oc.garage;

import java.io.Serializable;

public class BarreDeToit implements Options, Serializable {
	private String nom = "Barres de toit";
	private double prix = 0.0d;

	public BarreDeToit() {
		// TODO Auto-generated constructor stub
		prix = 1456.7d;
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
