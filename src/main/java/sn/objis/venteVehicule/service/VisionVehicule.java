package sn.objis.venteVehicule.service;

import java.sql.Connection;

import sn.objis.venteVehicule.dao.IDaoAutomobileImpl;
import sn.objis.venteVehicule.domaine.Automobile;

public class VisionVehicule {
	
	Connection con;
	private IDaoAutomobileImpl dao;
	
	public VisionVehicule(Connection con) {
		super();
		this.con = con;
		dao = new IDaoAutomobileImpl(con);
	}

	public Automobile decrit(long id) {
		
		return dao.findbyId(id);		
	}

}
