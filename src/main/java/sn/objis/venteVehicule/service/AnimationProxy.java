package sn.objis.venteVehicule.service;

public class AnimationProxy implements IAnimation {
	
	protected Diapo diapo = null;

	@Override
	public void clic() {
		if(diapo == null)
		{
			diapo = new Diapo();
			diapo.charge();
		}
		
		diapo.joue();
		
	}

	@Override
	public void dessine() {
		
		if (diapo != null)
			diapo.dessine();
		else 
			System.out.println("Affichage de la photo");
	}

}
