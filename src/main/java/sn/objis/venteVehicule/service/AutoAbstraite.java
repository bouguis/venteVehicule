package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public abstract class AutoAbstraite implements Cloneable {

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
