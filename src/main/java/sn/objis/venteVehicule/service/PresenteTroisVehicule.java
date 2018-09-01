package sn.objis.venteVehicule.service;

import java.util.List;

public class PresenteTroisVehicule implements IPresentationCatalogue{

	@Override
	public void presente(List<VisionVehicule> contenu) {
		
		int compteur;
		
		System.out.println("Presentation de trois automobiles par ligne");
		
		compteur = 0;
		
		for (VisionVehicule visionVehicule : contenu)
		{
			visionVehicule.decrit();
			
			compteur++;
			
			if (compteur == 3) {
				
				System.out.println();
				
				compteur = 0;
			}
			else 
				System.out.println(" ");
		}
		if (compteur != 0)
			System.out.println();
		System.out.println();
	}

}
