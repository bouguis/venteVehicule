package sn.objis.venteVehicule.service;

public class Diapo implements IAnimation {

	@Override
	public void dessine() {
		
		System.out.println("Affichage de la voiture");	
	}
	
	public void charge() {
		System.out.println("Chargement de la diapo");
	}
	
	public void joue() {
		System.out.println("Lecture de la diapo");
	}

	@Override
	public void clic() {
		
	}

}
