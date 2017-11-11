package com.oc.garage;

public enum TypeMoteur {
	DIESEL("DIESEL"),
	ESSENCE("ESSENCE"),
	HYBRIDE("HYBRIDE"),
	ELECTRIQUE("ELECTRIQUE");
	
	protected String nom = "";
	
	TypeMoteur(String nom) {
		this.nom = nom;
	}
	
	public String getType() {
		return nom;
	}
}
