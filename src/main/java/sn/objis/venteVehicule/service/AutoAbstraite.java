package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public abstract class AutoAbstraite extends ObjetBase implements Cloneable  {
	
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

	public abstract void afficherCaracteristiques();
}
