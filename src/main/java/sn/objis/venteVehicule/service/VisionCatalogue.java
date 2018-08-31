package sn.objis.venteVehicule.service;

import java.util.ArrayList;
import java.util.List;

public class VisionCatalogue {

	protected List<VisionVehicule> contenu = new ArrayList<VisionVehicule>();
	
	protected IPresentationCatalogue presentation;

	public VisionCatalogue(IPresentationCatalogue presentation) {
		
		contenu.add(new VisionVehicule(""));
		contenu.add(new VisionVehicule(""));
		contenu.add(new VisionVehicule(""));
		contenu.add(new VisionVehicule(""));
		
		this.presentation = presentation;
	}
	public void decrit() {
		presentation.presente(contenu);
	}
	
}
