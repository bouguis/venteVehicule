package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public class AutomobileElectrique extends AutoAbstraite {
	
	Automobile auto;
	
	public void afficherCaracteristiques() {
		System.out.println("Ceci est une automobile electrique de marque " + 
				auto.getMarque() + " de modele " + auto.getModel() + " de couleur " + auto.getCouleur()
				+ ". La description de son moteur est: " + auto.getMoteur() + ". Elle dispose de " + 
				auto.getNbrPlace() + " et son prix est de " + auto.getPrix() + ".");
	}

}