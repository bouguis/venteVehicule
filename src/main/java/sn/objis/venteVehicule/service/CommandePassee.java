package sn.objis.venteVehicule.service;

import java.sql.Connection;

import sn.objis.venteVehicule.dao.IDaoClientImpl;
import sn.objis.venteVehicule.dao.IDaoCommandeImpl;
import sn.objis.venteVehicule.domaine.Client;
import sn.objis.venteVehicule.domaine.Commande;

public class CommandePassee {
	
	Connection con;
	private IDaoClientImpl daoclient;
	private IDaoCommandeImpl daocommande;

	public CommandePassee(Connection con) {
		super();
		this.con = con;
		daoclient = new IDaoClientImpl(con);
		daocommande = new IDaoCommandeImpl(con);
	}
	
	public void ajoutClient(Client t) {
		
		daoclient.ajouter(t);
	}
	public void valideCommande(Commande t) {
		daocommande.ajouter(t);
		
	}
	
	
}
