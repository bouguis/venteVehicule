/**
 * 
 */
package sn.objis.venteVehicule.domaine;

import java.sql.Blob;

/**
 * @author HP
 *
 */
public class Automobile {
	//Proprietes
	private long idAuto;
	private Blob photo;
	private String moteur;
	private String marque;
	private String model;
	private String couleur;
	private double prix;
	private int nbrPlace;
	private String description;
	
	
	//Constructeurs
	
	public Automobile() {
		super();
	}
	
	public Automobile(long idAuto, Blob photo, String moteur, String marque, String model, String couleur, double prix,
			int nbrPlace, String description) {
		super();
		this.idAuto = idAuto;
		this.photo = photo;
		this.moteur = moteur;
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.prix = prix;
		this.nbrPlace = nbrPlace;
		this.description = description;
	}

	public Automobile(Blob photo,String moteurRecuperer, String marqueRecuperer, String modelRecuperer, String couleurRecuperer,
			Double prixRecuperer, int nbrPlaceRecuperer, String descriptionRecuperer) {
		// TODO Auto-generated constructor stub
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

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
	
	public int getNbrPlace() {
		return nbrPlace;
	}

	public void setNbrPlace(int nbr) {
		this.nbrPlace = nbr;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}
	
	
	

}
