package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public class CreationAuto {
	
	protected AutoAbstraite modelAuto;

	public CreationAuto(AutoAbstraite modelAuto) {
		super();
		this.modelAuto = modelAuto;
	}

	public AutoAbstraite getModelAuto() {
		return modelAuto;
	}

	public void setModelAuto(AutoAbstraite modelAuto) {
		this.modelAuto = modelAuto;
	}
	
	Automobile creerAutomobile() {
		if (modelAuto == null)
			return null;
		return modelAuto.reproduire();
	}

}
