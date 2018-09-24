package sn.objis.venteVehicule.service;

import java.sql.Connection;
import java.util.List;

import sn.objis.venteVehicule.dao.IDaoAutomobileImpl;
import sn.objis.venteVehicule.domaine.Automobile;

public class PresenteTroisVehicule implements IPresentationCatalogue{
	
	Connection con;
	private IDaoAutomobileImpl dao;

	public PresenteTroisVehicule(Connection con) {
		super();
		this.con = con;
		dao = new IDaoAutomobileImpl(con);
	}

	@Override
	public List<Automobile> presente() {
		return dao.getAll();

	}
}
