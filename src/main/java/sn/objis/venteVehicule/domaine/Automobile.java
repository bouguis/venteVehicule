/**
 * 
 */
package sn.objis.venteVehicule.domaine;

import java.io.FileInputStream;
import java.sql.Blob;

/**
 * @author HP
 *
 */
public class Automobile {
	//Proprietes
	private long idAuto;
	private String photo ;
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
	
	public Automobile(  String moteur, String marque, String model, String couleur, double prix,
			int nbrPlace, String description, String photo) {
		super();
		this.moteur = moteur;
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.prix = prix;
		this.nbrPlace = nbrPlace;
		this.description = description;
		this.photo = photo;
	}

	
	

	public Automobile(String moteur, String marque, String model, String couleur, double prix, int nbrPlace,
			String description) {
		super();
		this.moteur = moteur;
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.prix = prix;
		this.nbrPlace = nbrPlace;
		this.description = description;
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

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}
	
	
	

}
