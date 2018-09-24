package sn.objis.venteVehicule.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import sn.objis.venteVehicule.domaine.Client;

public class IDaoClientImpl implements IDaoClient {

	private Connection con;

	public IDaoClientImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public void ajouter(Client t) {

		try {

			// Etape 1 : Preparation de la requête

			String sql = " INSERT INTO client( nom, prenom, sexe, adresse, email, tel, codeClient)  VALUES(?,?,?,?,?,?,?)";

			// Récupération d'une Zone de requete
			PreparedStatement pst = con.prepareStatement(sql);

			// Etape 2 : Transmission des valeurs aux parametres de la requête

			pst.setString(1, t.getNom());

			pst.setString(2, t.getPrenom());

			pst.setString(3, t.getSexe());

			pst.setString(4, t.getAdresse());

			pst.setString(5, t.getEmail());

			pst.setString(6, t.getTel());

			pst.setString(7, t.getCodeClient());

			// Etape 3 : Execution e la requête
			pst.executeUpdate();

			System.out.println("Ajout  Reussi !!!");

		} catch (SQLException e) {
			System.out.println("Probleme de requête SQL");
			e.printStackTrace();
		}

	}

	@Override
	public List<Client> getAll() {
		List<Client> listeClient = new ArrayList<>();
		Client client = null;

		try {

			// Etape 1 : Preparation de la requête
			String sql = "SELECT * FROM client";

			Statement st = con.createStatement();

			// Etape 2 : Execution de la requête

			ResultSet rs = st.executeQuery(sql);

			// Etape 3 : Traitement des données du resultat de la requête

			while (rs.next()) {
				long idRecupere = rs.getLong("id_client");
				String nomRecuperer = rs.getString("nom");
				String prenomRecuperer = rs.getString("prenom");
				String sexeRecuperer = rs.getString("sexe");
				String adresseRecuperer = rs.getString("adresse");
				String emailRecuperer = rs.getString("email");
				String telRecuperer = rs.getString("tel");
				String codeRecuperer = rs.getString("code");

				client = new Client(idRecupere, nomRecuperer, prenomRecuperer, sexeRecuperer, adresseRecuperer,
						emailRecuperer, telRecuperer, codeRecuperer);
				listeClient.add(client);
			}
			System.out.println("Recherche reussie!");
		} catch (SQLException e) {
			System.out.println("Probleme de requete SQL!!");
			e.printStackTrace();
		}

		return listeClient;
	}

	@Override
	public void update(Client t) {
		
		try {

			// Etape 1 : Préparation de la Requête
			String sql = "UPDATE client SET nom=?, prenom=?, sexe=?, adresse=?, email=?, tel=?, code=? WHERE id_client=? ";

			//Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);

			// Etape 2 : Transmission des valeurs aux paramétres de la requête
			
			pst.setString(1, t.getNom());
			pst.setString(2, t.getPrenom());
			pst.setString(3, t.getSexe());
			pst.setString(4, t.getAdresse());
			pst.setString(5, t.getEmail());
			pst.setString(6, t.getTel());
			pst.setString(7, t.getCodeClient());
			
			//Etape 3 : Execution de la requête
			
			pst.executeUpdate();
			
			System.out.println("Modification Réussie !!!");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Client t) {
		
		try {
			// Preparation de la requete
			String sql = "DELETE From client WHERE id_client=?";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			pst.setLong(1, t.getIdClient());
			
			// Execution de la requete
			pst.executeUpdate();
			
			System.out.println("Suppression reussie!!");
			
		} catch (SQLException e) {
			System.out.println("Probleme de requete SQL!!!");
			e.printStackTrace();
		}
	}

	@Override
	public Client findbyId(long id) {
		Client client = null;
		
		try {
			// Preparation de la requete
			String sql ="SELECT From client WHERE id_client=?";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			pst.setLong(1, id);
			
			// Execution de la requete
			ResultSet rs = pst.executeQuery();
			
			// Traitement du resultat
			while (rs.next()) {
				long idRecupere = rs.getLong("id_client");
				String nomRecuperer = rs.getString("nom");
				String prenomRecuperer = rs.getString("prenom");
				String sexeRecuperer = rs.getString("sexe");
				String adresseRecuperer = rs.getString("adresse");
				String emailRecuperer = rs.getString("email");
				String telRecuperer = rs.getString("tel");
				String codeRecuperer = rs.getString("code");

				client = new Client(idRecupere, nomRecuperer, prenomRecuperer, sexeRecuperer, adresseRecuperer,
						emailRecuperer, telRecuperer, codeRecuperer);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return client;
	}

	public Client findByCode(long code) {
Client client = null;
		
		try {
			// Preparation de la requete
			String sql ="SELECT From client WHERE code=?";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			pst.setLong(1, code);
			
			// Execution de la requete
			ResultSet rs = pst.executeQuery();
			
			// Traitement du resultat
			while (rs.next()) {
				long idRecupere = rs.getLong("id_client");
				String nomRecuperer = rs.getString("nom");
				String prenomRecuperer = rs.getString("prenom");
				String sexeRecuperer = rs.getString("sexe");
				String adresseRecuperer = rs.getString("adresse");
				String emailRecuperer = rs.getString("email");
				String telRecuperer = rs.getString("tel");
				String codeRecuperer = rs.getString("code");

				client = new Client(idRecupere, nomRecuperer, prenomRecuperer, sexeRecuperer, adresseRecuperer,
						emailRecuperer, telRecuperer, codeRecuperer);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return client;
	}

}
