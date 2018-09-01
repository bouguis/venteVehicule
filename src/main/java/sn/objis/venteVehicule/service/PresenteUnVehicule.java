package sn.objis.venteVehicule.service;

import java.util.List;

public class PresenteUnVehicule implements IPresentationCatalogue{

	@Override
	public void presente(List<VisionVehicule> contenu) {
		
		System.out.println("Presentation d'une automibile par ligne");
		
		for (VisionVehicule visionVehicule : contenu) {
			
			visionVehicule.decrit();
			
			System.out.println();
		}
		System.out.println();
	}

}
