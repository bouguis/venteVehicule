package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;

public interface IElement {
	
	Automobile auto = null;
	
	String descript = auto.getDescription();
	
	public boolean motCleValide(String motCle);

}
