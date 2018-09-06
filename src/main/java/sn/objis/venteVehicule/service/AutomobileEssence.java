package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public class AutomobileEssence extends Automobile {
	
	

	Automobile auto;
	
	public void afficherCaracteristiques() {
		System.out.println("Ceci est une automobile à essence de marque " + auto.getMarque() + " de modele " + auto.getModel() + " de couleur " + auto.getCouleur()
	+ ". La description de son moteur est: " + auto.getMoteur() + ". Elle dispose de " + 
	auto.getNbrPlace() + " et son prix est de " + auto.getPrix() + ".");
	}

	

}
