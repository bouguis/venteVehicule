package sn.objis.venteVehicule.service;

public abstract class Decorateur implements IGraphismeVehicule{
	
	protected IGraphismeVehicule graphe;

	public Decorateur(IGraphismeVehicule graphe) {
		super();
		this.graphe = graphe;
	}
	
	public void affiche() {
		
		graphe.affiche();
	}

}
