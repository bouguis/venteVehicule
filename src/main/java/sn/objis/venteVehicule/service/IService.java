/**
 * 
 */
package sn.objis.venteVehicule.service;

import java.util.List;

/**
 * @author diawara
 *
 */
public interface IService <T> {
	
	public void add(T t);
	
	public List<T> findAll();
	
	public void maj(T t);
	
	public void supprimer(T t);
	
	public T rechercherId(long id);

}
