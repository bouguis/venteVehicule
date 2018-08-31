package sn.objis.venteVehicule.service;

public class ModelDecorateur extends Decorateur {

	public ModelDecorateur(IGraphismeVehicule graphe) {
		super(graphe);
	}
	
	protected void infosModel() {
	
		System.out.println("Informations techniques du model");
	}
	
	public void affiche() {
		super.affiche();
		this.infosModel();
	}
	
}
