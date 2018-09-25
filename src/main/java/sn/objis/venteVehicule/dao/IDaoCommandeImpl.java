package sn.objis.venteVehicule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import sn.objis.venteVehicule.domaine.Commande;

public class IDaoCommandeImpl implements IDaoCommande {
	
	private Connection con;
	
	public IDaoCommandeImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public void ajouter(Commande t) {
		try {
			// Preparation de la requete
			String sql = "INSERT INTO commande(dateCommande, idClient) VALUES (?,?)";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			pst.setString(1, t.getDateCommande());
			pst.setLong(2, t.getClient().getIdClient());
			
			
			
			// Execution de la requete
			pst.executeUpdate();
			
			System.out.println("Ajout reussi!!");
			
		} catch (SQLException e) {
			System.out.println("Probleme de requete SQL!!!");
			e.printStackTrace();
		}
	}

	@Override
	public List<Commande> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Commande t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Commande t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Commande findbyId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
