package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.domaine.Commande;

public abstract class EtatCommande {
	
	protected Commande commande;

	public EtatCommande(Commande commande) {
		super();
		this.commande = commande;
	}
	
	public abstract void ajouterVehicule(Automobile auto);
	
	public abstract void retirerVehicule(Automobile auto);
	
	public abstract void efface();
	
	public abstract EtatCommande etatSuivant();

}
