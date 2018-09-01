package sn.objis.venteVehicule.service;

public abstract class ObjetBase {
	
	protected ObjetBase suivant;
	
	private String descriptionParDefaut() {
		return "description par defaut";
	}
	
	protected abstract String description();
	
	public String getDescription() {
		String resultat;
		resultat = this.description();
		if (resultat != null) 
			return resultat;
		if (suivant != null)
			return suivant.getDescription();
		else
			return this.descriptionParDefaut();
	}
	
	public void setSuivant(ObjetBase suivant) {
		this.suivant = suivant;
	}
	
}
