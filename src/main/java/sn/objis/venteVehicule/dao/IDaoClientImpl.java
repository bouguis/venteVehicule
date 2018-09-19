package sn.objis.venteVehicule.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import sn.objis.venteVehicule.domaine.Client;

public class IDaoClientImpl implements IDaoClient{
	
	private Connection con;
	
	public IDaoClientImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public void ajouter(Client t) {

		try {
		
			// Etape 1 : Preparation de la requête

			String sql = " INSERT INTO client( nom, prenom, sexe, adresse, email, tel, codeClient, commande)  VALUES(?,?,?,?,?,?,?,?)";

			//Récupération d'une Zone de requete
			PreparedStatement pst = con.prepareStatement(sql);

			// Etape 2 : Transmission des valeurs aux parametres de la requête

			pst.setString(1, t.getNom());

			pst.setString(2, t.getPrenom());

			pst.setString(3, t.getSexe());

			pst.setString(4, t.getAdresse());
			
			pst.setString(5, t.getEmail());
			
			pst.setString(6, t.getTel());
			
			pst.setString(7, t.getCodeClient());
			
			pst.setLong(8, t.getCommande().getIdCommande());

			// Etape 3 : Execution e la requête
			pst.executeUpdate();
			
			System.out.println("Ajout  Reussi !!!");


		} catch (SQLException e)  {
			System.out.println("Probleme de requête SQL");
			e.printStackTrace();
		}

		
	}

	@Override
	public List<Client> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Client t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Client findbyId(long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Client findByCode(long code) {
		
		return null;
	}

}
