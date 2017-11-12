package com.oc.garage;

import java.io.Serializable;

public class SiegeChauffant implements Options, Serializable {
	private String nom = "Siège chauffant";
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
