/**
 * 
 */
package sn.objis.venteVehicule.service;

import java.sql.Connection;
import java.util.List;

import sn.objis.venteVehicule.dao.IDaoAutomobileImpl;
import sn.objis.venteVehicule.domaine.Automobile;

/**
 * @author diawara
 *
 */
public class IServiceAutomobileImpl implements IServiceAutomobile {
	
	Connection con;
	private IDaoAutomobileImpl dao ;

	public IServiceAutomobileImpl(Connection con) {
		super();
		this.con = con;
		dao = new IDaoAutomobileImpl(con);
	}

	
	@Override
	public List<AutoAbstraite> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see sn.objis.venteVehicule.service.IService#maj(java.lang.Object)
	 */
	@Override
	public void maj(AutoAbstraite t) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see sn.objis.venteVehicule.service.IService#supprimer(java.lang.Object)
	 */
	@Override
	public void supprimer(AutoAbstraite t) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see sn.objis.venteVehicule.service.IService#rechercherId(long)
	 */
	@Override
	public AutoAbstraite rechercherId(long id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void add(AutoAbstraite t) {
		// TODO Auto-generated method stub
		
	}

}
