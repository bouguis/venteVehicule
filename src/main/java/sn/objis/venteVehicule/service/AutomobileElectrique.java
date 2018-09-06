package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public class AutomobileElectrique extends Automobile {
	
	public void afficherCaracteristiques() {
		System.out.println("Ceci est une automobile electrique de marque " + 
				this.getMarque() + " de modele " + this.getModel() + " de couleur " + this.getCouleur()
				+ ". La description de son moteur est: " + this.getMoteur() + ". Elle dispose de " + 
				this.getNbrPlace() + " et son prix est de " + this.getPrix() + ".");
	}

	
}
