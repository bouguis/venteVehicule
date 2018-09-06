package sn.objis.venteVehicule.service;

import java.sql.Connection;
import sn.objis.venteVehicule.dao.IDaoAutomobileImpl;
import sn.objis.venteVehicule.domaine.Automobile;

public class CreationAutoEssence implements CreationAuto{
	
	private IDaoAutomobileImpl dao;
	Connection con;

	public CreationAutoEssence(Connection con) {
		super();
		this.con = con;
		dao = new IDaoAutomobileImpl(con);
	}


	@Override
	public void creerAutomobile(Automobile auto) {
		dao.ajouter(auto);
	}
	}
	