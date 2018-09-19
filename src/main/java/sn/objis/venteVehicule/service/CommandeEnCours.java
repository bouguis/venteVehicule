package sn.objis.venteVehicule.service;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.domaine.Commande;

public class CommandeEnCours extends EtatCommande{

	public CommandeEnCours(Commande commande) {
		super(commande);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void ajouterVehicule(Automobile auto) {
		commande.getListeAutos().add(auto);
	}

	@Override
	public void retirerVehicule(Automobile auto) {
		commande.getListeAutos().remove(auto);
	}

	@Override
	public EtatCommande etatSuivant() {
		
		return new CommandeValidee(commande);
	}

	@Override
	public void efface() {
		commande.getListeAutos().clear();
		
	}

	
}
