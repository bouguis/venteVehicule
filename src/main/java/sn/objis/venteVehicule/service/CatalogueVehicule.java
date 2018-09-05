package sn.objis.venteVehicule.service;

public class CatalogueVehicule extends Catalogue<AutoAbstraite, IterateurVehicule>
{
	
	public CatalogueVehicule() {
		
		
		
	}
		
	
	protected IterateurVehicule creeIterateur() {
		
		return new IterateurVehicule();
	}

}
