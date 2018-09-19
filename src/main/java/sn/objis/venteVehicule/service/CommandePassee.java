package sn.objis.venteVehicule.service;

import java.util.List;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.domaine.Commande;

public class CommandePassee {
	Commande commande;
	protected List<Automobile> vehicules = commande.getListeAutos();
	protected EtatCommande etatCommande;
	
	public CommandePassee() {
		
		etatCommande = new CommandeEnCours(commande);
		
	}
	
	public void ajouterAutomobile(Automobile automobile) {
		
		etatCommande.ajouterVehicule(automobile);
		
	}
	
	public void retireAutomobile(Automobile automobile) {
	
		etatCommande.retirerVehicule(automobile);
	}
	
	public void efface(){
		
		etatCommande.efface();
	}
	
	public void etatSuivant(){
		
		etatCommande = etatCommande.etatSuivant();
	}
	
	public List<Automobile> getAuto(){
		
		return vehicules;
	}
	
}
