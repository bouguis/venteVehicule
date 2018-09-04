package sn.objis.venteVehicule.dao;

import java.util.List;
	
public interface IDao <T> {
		
		public void ajouter(T t);
		
		public List<T> getAll();
		
		public void update(T t);
		
		public void delete(T t);
		
		public T findbyId(long id);
		
	}



