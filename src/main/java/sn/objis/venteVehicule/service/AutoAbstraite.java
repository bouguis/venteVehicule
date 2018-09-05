package sn.objis.venteVehicule.service;

import java.sql.Blob;

import sn.objis.venteVehicule.domaine.Automobile;

public class AutoAbstraite extends ObjetBase implements Cloneable, IElement {
	
	Automobile auto = null;
	 long idAuto = auto.getIdAuto();
	 Blob photo = auto.getPhoto();
	 String moteur = auto.getMoteur();
	 String marque = auto.getMarque();
	 String model = auto.getModel();
	 String couleur = auto.getCouleur();
	 Double prix = auto.getPrix();
	 int nbrPlace = auto.getNbrPlace();
	 String description = auto.getDescription();
	 
	 public AutoAbstraite(Blob photo, String moteur, String marque, String model, String couleur, Double prix,
			int nbrPlace, String description) {
		super();
		this.photo = photo;
		this.moteur = moteur;
		this.marque = marque;
		this.model = model;
		this.couleur = couleur;
		this.prix = prix;
		this.nbrPlace = nbrPlace;
		this.description = description;
	}

	public AutoAbstraite(long idAuto, Blob photo, String moteur, String marque, String model, String couleur,
			Double prix, int nbrPlace, String description) {
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

	public Blob getPhoto() {
		return photo;
	}

	public void setPhoto(Blob photo) {
		this.photo = photo;
	}

	public String getMoteur() {
		return moteur;
	}

	public void setMoteur(String moteur) {
		this.moteur = moteur;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
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

	public Double getPrix() {
		return prix;
	}

	public void setPrix(Double prix) {
		this.prix = prix;
	}

	public int getNbrPlace() {
		return nbrPlace;
	}

	public void setNbrPlace(int nbrPlace) {
		this.nbrPlace = nbrPlace;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(long idAuto) {
		this.idAuto = idAuto;
	}
	 
	public AutoAbstraite(String description) {
		super();
		this.description = description;
	}
	
	protected String description() {
		return description;
	}

	public AutoAbstraite reproduire() {
		AutoAbstraite auto = null;
		try {
			auto = (AutoAbstraite) this.clone();
		} catch (CloneNotSupportedException e) {

			e.printStackTrace();
		}
		return auto;

	}

	public void affiche() {
		
		System.out.println("Description du vehicule : " + description);
		
	}
	public void afficherCaracteristiques() {
		
	}

	@Override
	public boolean motCleValide(String motCle) {
		// TODO Auto-generated method stub
		return false;
	}
}
