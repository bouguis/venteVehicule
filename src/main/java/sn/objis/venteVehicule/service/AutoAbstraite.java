package sn.objis.venteVehicule.service;

import java.sql.Connection;

import sn.objis.venteVehicule.dao.IDaoAutomobileImpl;
import sn.objis.venteVehicule.domaine.Automobile;

public abstract class AutoAbstraite extends ObjetBase implements Cloneable, IElement {
	
	private IDaoAutomobileImpl dao;
	Automobile auto = null;
	Connection con;
	public AutoAbstraite(Connection con) {
		super();
		this.con = con;
		dao = new IDaoAutomobileImpl(con);
	}
	
	 String description = auto.getDescription();
	public AutoAbstraite(String description) {
		super();
		this.description = description;
	}
	
	protected String description() {
		return description;
	}

	public void produire(Automobile t) {
		dao.ajouter(t);
		
	}

	public void affiche() {
		
		System.out.println("Description du vehicule : " + description);
		
	}
	public abstract void afficherCaracteristiques();
}
