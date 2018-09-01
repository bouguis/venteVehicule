package sn.objis.venteVehicule.service;

public class Modele extends ObjetBase {
	
	protected String description;
	protected String nom;

	public Modele(String description, String nom) {
		super();
		this.description = description;
		this.nom = nom;
	}

	@Override
	protected String description() {
		if(description != null)
			return "Modele " + nom + " : " + description;
		else
		return null;
	}

}
