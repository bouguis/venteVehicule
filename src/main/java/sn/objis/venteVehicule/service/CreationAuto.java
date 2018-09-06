package sn.objis.venteVehicule.service;

import java.sql.Connection;

import sn.objis.venteVehicule.dao.IDaoAutomobileImpl;
import sn.objis.venteVehicule.domaine.Automobile;

public class CreationAuto {
	Connection con;
	private IDaoAutomobileImpl dao;
	
	
	public CreationAuto(Connection con) {
		super();
		this.con = con;
		dao = new IDaoAutomobileImpl(con);
	}

	protected AutoAbstraite exempleAuto;

	

	public AutoAbstraite getModelAuto() {
		return  exempleAuto;
	}

	public void setModelAuto(AutoAbstraite modelAuto) {
		this. exempleAuto = modelAuto;
	}
	
	public void creerAutomobile(Automobile t) {
		
		  dao.ajouter(t);;
	}

}
