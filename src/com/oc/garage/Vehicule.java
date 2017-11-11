package com.oc.garage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Vehicule {
	protected double prix;
	protected String nom;
	protected List<Options> option = new ArrayList<Options> ();
	protected Marque nomMarque;
	
	
	public Vehicule() {
		// TODO Auto-generated constructor stub
		nom = "Laguna";
		prix = 12500d;
		option.add(new GPS());
		option.add(new BarreDeToit());
		nomMarque = PIGEO;	
	}
	
	public Vehicule(String nom, double prix, Marque nomMarque) {
		this.nom = nom;
		this.prix = prix;
		this.nomMarque = nomMarque;
	}
	
	public String toString() {
		String str = this.nomMarque + " " + this.nom + " " + this.prix + "€\n";
		
		return str;
		
	}
	
	public void addOption(Options opt) {
		option.add(opt);
	}
	
	public List<Options> getOptions() {
		ListIterator it = option.listIterator();
		while(it.hasNext())	
			return (List<Options>) (List) it.next();
		
		
		while(it.hasNext()) { 
			
		}
	}
		
	
	public double getPrix() {
		return prix;
	}

}
