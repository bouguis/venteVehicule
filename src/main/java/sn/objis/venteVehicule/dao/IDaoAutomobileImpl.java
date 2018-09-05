package sn.objis.venteVehicule.dao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sn.objis.venteVehicule.service.AutoAbstraite;

public class IDaoAutomobileImpl implements IDaoAutomobile{
	
	private Connection con;

	public IDaoAutomobileImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public void ajouter(AutoAbstraite t) {
		
		try {

			// Etape 1 : Preparation de la requête

			String sql = " INSERT INTO automobile(photo, moteur, marque, model, couleur, prix, nbrPlace, description )  VALUES(?,?,?,?,?,?,?,?)";

			//Récupération d'une Zone de requete
			PreparedStatement pst = con.prepareStatement(sql);

			// Etape 2 : Transmission des valeurs aux parametres de la requête

			pst.setString(1, t.getMoteur());

			pst.setString(2, t.getMarque());

			pst.setString(3, t.getModel());

			pst.setString(4, t.getCouleur());
			
			pst.setDouble(5, t.getPrix());
			
			pst.setInt(6, t.getNbrPlace());
			
			pst.setString(7, t.getDescription());
			
			pst.setBlob(8, t.getPhoto());

			// Etape 3 : Execution e la requête

			pst.executeUpdate();
			
			System.out.println("Ajout  Reussi !!!");


		} catch (SQLException e) {
			System.out.println("Probleme de requête SQL");
			e.printStackTrace();
		}

		
	}

	@Override
	public List<AutoAbstraite> getAll() {
		List<AutoAbstraite> listeAuto = new ArrayList<>();

		try {

			// Etape 1 : Preparation de la requête
			String sql = "SELECT * From automobile";

			Statement st = con.createStatement();

			// Etape 2 : Execution de la requête

			ResultSet rs = st.executeQuery(sql);

			// Etape 3 : Traitement des données du resultat de la requête
	 		while (rs.next()) {
	 			Blob photoRecuperer = rs.getBlob("photo");
				String moteurRecuperer = rs.getString("moteur");
				String marqueRecuperer = rs.getString("marque");
				String modelRecuperer = rs.getString("model");
				String couleurRecuperer = rs.getString("couleur");
				Double prixRecuperer = rs.getDouble("prix");
				int nbrPlaceRecuperer = rs.getInt("nbrPlace");
				String descriptionRecuperer = rs.getString("description");

		AutoAbstraite a = new AutoAbstraite(photoRecuperer, moteurRecuperer, marqueRecuperer, modelRecuperer, couleurRecuperer, prixRecuperer, nbrPlaceRecuperer, descriptionRecuperer);
				listeAuto.add(a);
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listeAuto;
	}

	@Override
	public void update(AutoAbstraite t) {
		
		try {

			// Etape 1 : Préparation de la Requête
			String sql = "UPDATE automoble SET moteur=?, marque=?, model=?, couleur=?, prix=?, nbrPlace=?, description=?, photo=? WHERE id_agentmairie=? ";

			//Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);

			// Etape 2 : Transmission des valeurs aux paramétres de la requête
			
			pst.setBlob(1, t.getPhoto());
			pst.setString(2, t.getMoteur());
			pst.setString(3, t.getMarque());
			pst.setString(4, t.getModel());
			pst.setString(5, t.getCouleur());
			pst.setDouble(6, t.getPrix());
			pst.setInt(7, t.getNbrPlace());
			pst.setString(8, t.getDescription());
			
			//Etape 3 : Execution de la requête
			
			pst.executeUpdate();
			
			System.out.println("Modification Réussie !!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public void delete(AutoAbstraite t) {

		try {
			
			// Etape 1 : Préparation de la Requête
			String sql = "DELETE From automobile WHERE id_automobile=?";
			
			//Récupération d'une zone de requete 
			PreparedStatement pst = con.prepareStatement(sql);
			
			//Etape 2 : Transmission de valeurs aux paramétres de la requête
			
			pst.setLong(1, t.getIdAuto());

			// Etape 3 : Execution de la requête
			pst.executeUpdate();
			
			System.out.println("Suppression Reussie !!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public AutoAbstraite findbyId(long id) {
		AutoAbstraite auto = null;
		try {

			// Etape 1 : Preparation de la requête
			String sql = "SELECT *  From automobile WHERE id_automobile=?";

			//Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);

			// Etape 2 : Transmission des valeurs aux paramétres de la requête

			pst.setLong(1, id);

			// Etape 3 : Execution de la requête

			ResultSet rs = pst.executeQuery();

			// Etape 4 : Traitement du resultat

			while (rs.next()) {

				long idAuto = rs.getLong("id_automobile");
				Blob photo = rs.getBlob("photo");
				String moteur = rs.getString("moteur");
				String marque = rs.getString("marque");
				String model = rs.getString("model");
				String couleur = rs.getString("couleur");
				Double prix = rs.getDouble("prix");
				int nbrPlace = rs.getInt("nbrPlace");
				String description = rs.getString("description");
				
				auto = new AutoAbstraite(idAuto, photo, moteur, 
						marque, model, couleur, prix, nbrPlace, description);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return auto;
	}

	
}
