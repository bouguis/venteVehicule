package sn.objis.venteVehicule.service;
import java.util.List;

import sn.objis.venteVehicule.domaine.Automobile;


/**
 * @author HP
 *
 */
public interface CreationAuto {
	
	public void creerAutomobile(Automobile auto);
	public List<Automobile> findAll();
	public Automobile rechercheId(long id);

}
