package com.oc.garage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Vehicule implements Serializable {
	protected double prix;
	protected double prixOptions;
	protected String nom;
	protected List<Options> option = new ArrayList<Options> ();
	protected Moteur type;
	protected Marque nomMarque;
	
	
	
	public Vehicule() {
		// TODO Auto-generated constructor stub
		nom = "Laguna";
		prix = 12500d;
		option.add(new GPS());
		option.add(new BarreDeToit());
		nomMarque = Marque.RENO;
	}
	
	public Vehicule(String nom, double prix, List<Options> opt, Marque nomMarque) {
		this.nom = nom;
		this.prix = prix;
		this.option = opt;
		this.nomMarque = nomMarque;
	}
	
	public String toString() {
		
		return this.getNom() + " " + this.getNomMarque() + " " + this.getMoteur() + " ("
				+ this.getPrix() + "€) (" + this.getOptions() + " prix : " + this.getPrixOptions()
				+ "€) Valeur totale: " + this.prixTotal() + "€";
	}
	
	public void addOption(Options opt) {
		option.add(opt);
	}
	
	public List<Options> getOptions() {
		return option;
		
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
	
	public Moteur getMoteur() {
		return type;
	}
	
	public void setMoteur(Moteur type) {
		this.type = type;
	}
	
	public double getPrixOptions() {
		for(int i = 0; i < option.size(); i++)
			prixOptions += option.get(i).getPrix();
		return prixOptions;
	}
	
	public double prixTotal() {
		double total = prix + prixOptions;
		return total;
	}
	
}
