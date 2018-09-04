package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public class AutomobileElectrique extends AutoAbstraite {
	
	public AutomobileElectrique(String description) {
		super(description);
		// TODO Auto-generated constructor stub
	}

	Automobile auto;
	
	public void afficherCaracteristiques() {
		System.out.println("Ceci est une automobile electrique de marque " + 
				auto.getMarque() + " de modele " + auto.getModel() + " de couleur " + auto.getCouleur()
				+ ". La description de son moteur est: " + auto.getMoteur() + ". Elle dispose de " + 
				auto.getNbrPlace() + " et son prix est de " + auto.getPrix() + ".");
	}

	@Override
	public boolean motCleValide(String motCle) {
		
		return descript.indexOf(motCle) != -1;
	}

}
