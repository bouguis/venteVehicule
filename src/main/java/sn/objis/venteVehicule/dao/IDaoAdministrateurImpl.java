package sn.objis.venteVehicule.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import sn.objis.venteVehicule.domaine.Administrateur;

public class IDaoAdministrateurImpl implements IDaoAdministrateur{
	
	private Connection con;

	public IDaoAdministrateurImpl(Connection con) {
		super();
		this.con = con;
	}

	@Override
	public void ajouter(Administrateur t) {
		
		try {
			// Preparation de la requete
			String sql = "INSERT INTO administrateur(nom, prenom) VALUES (?,?)";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			
			pst.setString(1, t.getNom());
			pst.setString(2, t.getPrenom());
			
			// Execution de la requete
			pst.executeUpdate();
			
			System.out.println("Ajout reussi!!");
			
		} catch (SQLException e) {
			System.out.println("Probleme de requete SQL!!!");
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Administrateur> getAll() {
		List<Administrateur> listeAdmin = new ArrayList<>();
		Administrateur admin;
		
		try {
			// Preparation de la requete
			String sql = "SELECT *FROM administrateur";
			
			// Recuperation d'une zone de requete
			Statement st = con.createStatement();
			
			// Execution de la requete
			ResultSet rs = st.executeQuery(sql);
			
			// Traitement du resultat
			while (rs.next()) {
				long idRecupere = rs.getLong("idAdmin");
				String nomRecupere = rs.getString("nom");
				String prenomRecupere = rs.getString("prenom");
				
				admin = new Administrateur(idRecupere, nomRecupere, prenomRecupere);
				listeAdmin.add(admin);
				
				System.out.println("Recherche reussie!!!");
				
			}
		} catch (SQLException e) {
			System.out.println("Probleme requete SQL!!!");
			e.printStackTrace();
		}
		
		return listeAdmin;
	}

	@Override
	public void update(Administrateur t) {
		
		try {
			// Preparation de la requete
			String sql = "UPDATE administrateur SET nom=?, prenom=? WHERE id_admin=?";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			pst.setLong(1, t.getIdAdmin());
			pst.setString(2, t.getNom());
			pst.setString(3, t.getPrenom());
			
			// Traitement de la requete
			pst.executeUpdate();
			
			System.out.println("Modification reussie!!!");
			
		} catch (SQLException e) {
			System.out.println("Probleme de requete SQL!!");
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(Administrateur t) {
	
		try {
			// Preparation de la requete
			String sql = "DELETE From administrateur WHERE id_admin=?";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			pst.setLong(1, t.getIdAdmin());
			
			// Execution de la requete
			pst.executeUpdate();
			
			System.out.println("Suppression reussie!!!");
			
		} catch (SQLException e) {
			System.out.println("Probleme de requete SQL!!!");
			e.printStackTrace();
		}
		
	}

	@Override
	public Administrateur findbyId(long id) {
		Administrateur admin = null;
		
		try {
			// Preparation de la requete
			String sql = "SELECT From administrateur WHERE id_admin=?";
			
			// Recuperation d'une zone de requete
			PreparedStatement pst = con.prepareStatement(sql);
			
			// Transmission des valeurs aux parametres de la requete
			pst.setLong(1, id);
			
			// Execution de la requete
			ResultSet rs = pst.executeQuery();
			
			// Traitement du resultat
			
			while (rs.next()) {
				long idRecupere = rs.getLong("id_admin");
				String nomRecupere = rs.getString("nom");
				String prenomRecupere = rs.getString("prenom");
				
				admin = new Administrateur(idRecupere, nomRecupere, prenomRecupere);
				
				System.out.println("Recherche effectuée avec succes!!!");
			}
			
		} catch (SQLException e) {
			System.out.println("Probleme de requete SQL!!!");
			e.printStackTrace();
		}
		
		
		
		return admin;
	}

}
