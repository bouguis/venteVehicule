/**
 * 
 */
package sn.objis.venteVehicule.domaine;

/**
 * @author diawara
 *
 */
public class Automobile {
	//Proprietes
	private long idAuto;
	private String moteur;
	private String version;
	private String model;
	private String appelation;
	private String puissance;
	private String couleur;
	private double prix;
	private int nombre;
	private int nbrPlace;
	
	//Constructeur
	/**
	 *Constructeur sans parametre 
	 */
	public Automobile() {
		super();
	}

	/**
	 * @param moteur
	 * @param version
	 * @param model
	 * @param appelation
	 * @param puissance
	 * @param couleur
	 * @param prix
	 * @param nombre
	 */
	public Automobile(String moteur, String version, String model, String appelation, String puissance, String couleur,
			double prix, int nombre) {
		super();
		this.moteur = moteur;
		this.version = version;
		this.model = model;
		this.appelation = appelation;
		this.puissance = puissance;
		this.couleur = couleur;
		this.prix = prix;
		this.nombre = nombre;
	}
	
	//Getters et Setters

	public long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(long idAuto) {
		this.idAuto = idAuto;
	}

	public String getMoteur() {
		return moteur;
	}

	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getAppelation() {
		return appelation;
	}

	public void setAppelation(String appelation) {
		this.appelation = appelation;
	}

	public String getPuissance() {
		return puissance;
	}

	public void setPuissance(String puissance) {
		this.puissance = puissance;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}
	
	public int getNbrPlace() {
		return nbrPlace;
	}

	public void setNbrPlace(int nbr) {
		this.nbrPlace = nbr;
	}
	
	
	

}
