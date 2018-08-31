package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public class VisionVehicule implements IGraphismeVehicule {
	
	Automobile auto;
	ModelDecorateur modele;
	MarqueDecorateur marque;
	AnimationProxy animation;
	
	protected String description = auto.getDescription();

	public VisionVehicule(String description) {
		super();
		this.description = description;
	}
	
	public void decrit() {
		
		System.out.println(description);
		modele.affiche();
		marque.affiche();
		
	}

	@Override
	public void affiche() {
		System.out.println("Affichage du vehicule");
		
		animation.dessine();
		animation.clic();
		animation.dessine();
	}

}
