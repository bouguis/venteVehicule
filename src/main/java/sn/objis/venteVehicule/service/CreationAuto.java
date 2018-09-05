package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.dao.IDaoAutomobile;


public class CreationAuto {
	
	IDaoAutomobile dao = null;
	
	protected AutoAbstraite modelAuto = null;

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
	
	AutoAbstraite creeAutomobile()
	{
	if (modelAuto == null)
		return null;
		return modelAuto.reproduire();
	}

}
