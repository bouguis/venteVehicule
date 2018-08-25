/**
 * 
 */
package sn.objis.venteVehicule.domaine;

import java.util.Date;

/**
 * @author diawara
 *
 */
public class Commande {
	//Proprietes
	private long idCommande;
	private Date dateCommande;
	private Date dateReception;
	private boolean validee;
	private String livree;
	private double taxes;
	private long idClient;
	private long idAuto;
	
	//Constructeur
	/**
	 *Constructeur sans parametre 
	 */
	public Commande() {
		super();
	}

	/**
	 * @param dateCommande
	 * @param dateReception
	 * @param validee
	 * @param livree
	 * @param taxes
	 */
	public Commande(Date dateCommande, Date dateReception, boolean validee, String livree, double taxes) {
		super();
		this.dateCommande = dateCommande;
		this.dateReception = dateReception;
		this.validee = validee;
		this.livree = livree;
		this.taxes = taxes;
	}
	
	//Getters et setters

	public long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(long idCommande) {
		this.idCommande = idCommande;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateReception() {
		return dateReception;
	}

	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}

	public boolean isValidee() {
		return validee;
	}

	public void setValidee(boolean validee) {
		this.validee = validee;
	}

	public String getLivree() {
		return livree;
	}

	public void setLivree(String livree) {
		this.livree = livree;
	}

	public double getTaxes() {
		return taxes;
	}

	public void setTaxes(double taxes) {
		this.taxes = taxes;
	}

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(long idAuto) {
		this.idAuto = idAuto;
	}
	
	
	
	
	

}
