package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.domaine.Commande;

public class CommandeValidee extends EtatCommande{

	public CommandeValidee(Commande commande) {
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
		commande.getListeAutos().clear();
	}

	@Override
	public EtatCommande etatSuivant() {
		
		return new CommandeLivree(commande);
	}

}
