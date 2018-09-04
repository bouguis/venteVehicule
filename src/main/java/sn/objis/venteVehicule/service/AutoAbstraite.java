package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public abstract class AutoAbstraite extends ObjetBase implements Cloneable, IElement {
	
	Automobile auto = null;
	 String description = auto.getDescription();
	public AutoAbstraite(String description) {
		super();
		this.description = description;
	}
	
	protected String description() {
		return description;
	}

	public Automobile reproduire() {
		Automobile auto = null;
		try {
			auto = (Automobile) this.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return auto;
	}

	public void affiche() {
		
		System.out.println("Description du vehicule : " + description);
		
	}
	public abstract void afficherCaracteristiques();
}
