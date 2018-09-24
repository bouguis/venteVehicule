package sn.objis.venteVehicule.service;

import java.sql.Connection;

import sn.objis.venteVehicule.dao.IDaoClientImpl;
import sn.objis.venteVehicule.domaine.Client;

public class CommandePassee {
	
	Connection con;
	private IDaoClientImpl daoclient;

	public CommandePassee(Connection con) {
		super();
		this.con = con;
		daoclient = new IDaoClientImpl(con);
	}
	
	public void ajoutClient(Client t) {
		
		daoclient.ajouter(t);
	}
	
	
}
