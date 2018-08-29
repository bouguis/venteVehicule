/**
 * 
 */
package sn.objis.venteVehicule.domaine;

/**
 * @author HP
 *
 */
public class Client {
	//Séction proprieés
	private long idClient;
	private String nom;
	private String prenom;
	private String sexe;
	private String adresse;
	private String email;
	private String tel;
	
	//Constructeurs
	/**
	 *Constructeur sans parametre 
	 */
	public Client() {
		super();
	}

	/**
	 * @param nom
	 * @param prenom
	 * @param sexe
	 * @param adresse
	 * @param email
	 * @param tel
	 */
	public Client(String nom, String prenom, String sexe, String adresse, String email, String tel) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.sexe = sexe;
		this.adresse = adresse;
		this.email = email;
		this.tel = tel;
	}
	
	//Getters et Setters

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
	

}
