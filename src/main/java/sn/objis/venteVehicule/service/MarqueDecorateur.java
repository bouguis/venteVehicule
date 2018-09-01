package sn.objis.venteVehicule.service;

public class MarqueDecorateur extends Decorateur{

	public MarqueDecorateur(IGraphismeVehicule graphe) {
		super(graphe);
	}
	
	protected void logoMarque() {
		
		System.out.println("Logo de la marque");
	}

	public void affiche() {  
		
		super.affiche();
		this.logoMarque();
	}
}
