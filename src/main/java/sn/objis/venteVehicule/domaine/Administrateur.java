/**
 * 
 */
package sn.objis.venteVehicule.domaine;

/**
 * @author HP
 *
 */
public class Administrateur {
	//proprietes
	private long idAdmin;
	private String nom;
	private String prenom;
	
	//Contructeurs
	
	/**
	 *Constructeur sans parametre 
	 */
	public Administrateur() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 */
	public Administrateur(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public Administrateur(long idAdmin, String nom, String prenom) {
		super();
		this.idAdmin = idAdmin;
		this.nom = nom;
		this.prenom = prenom;
	}

	//Getters et Setters

	public long getIdAdmin() {
		return idAdmin;
	}

	public void setIdAdmin(long idAdmin) {
		this.idAdmin = idAdmin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
	
	
	

}
