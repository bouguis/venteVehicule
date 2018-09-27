package sn.objis.venteVehicule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.venteVehicule.domaine.Automobile;
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
			String sql = "INSERT INTO commande(dateCommande, idAuto, emailClient, telClient) VALUES (?,?,?,?)";

			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);

			// Transmission des valeurs aux parametres de la requete
			pst.setString(1, t.getDateCommande());

			pst.setString(2, t.getAuto());
			pst.setString(3, t.getEmailClient());
			pst.setString(4, t.getTelClient());

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
		List<Commande> listesCommande = new ArrayList<>();

		try {
			// Etape 1 : Preparation de la requête
			String sql = "SELECT * FROM commande";

			Statement st = con.createStatement();

			// Etape 2 : Execution de la requête

			ResultSet rs = st.executeQuery(sql);

			// Etape 3 : Traitement des données du resultat de la requête
			while (rs.next()) {
				long idCommande = rs.getLong("idCommande");
				String dateCommande = rs.getString("dateCommande");
				String emailclient = rs.getString("emailClient");
				String telClient = rs.getString("telClient");
				String auto = rs.getString("idAuto");

				Commande commande = new Commande(idCommande, dateCommande, auto, emailclient, telClient);
				listesCommande.add(commande);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return listesCommande;
	}

	@Override
	public void update(Commande t) {

	}

	@Override
	public void delete(Commande t) {
		
		try {
			// Etape 1 : Préparation de la Requête
			String sql = "DELETE From commande WHERE idCommande=?";

			// Récupération d'une zone de requete
			
			PreparedStatement pst = con.prepareStatement(sql);
			// Etape 2 : Transmission de valeurs aux paramétres de la requête

			pst.setLong(1, t.getIdCommande());

			// Etape 3 : Execution de la requête
			pst.executeUpdate();

			System.out.println("Suppression Reussie !!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}

	@Override
	public Commande findbyId(long id) {
		
		return null;
	}

}
