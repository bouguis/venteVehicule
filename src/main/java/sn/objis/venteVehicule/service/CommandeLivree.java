package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.domaine.Commande;

public class CommandeLivree extends EtatCommande{

	public CommandeLivree(Commande commande) {
		super(commande);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterVehicule(Automobile auto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void retirerVehicule(Automobile auto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void efface() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public EtatCommande etatSuivant() {
		
		return this;
	}

}
