package com.oc.garage;

import java.io.Serializable;

public class GPS implements Options, Serializable {
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
