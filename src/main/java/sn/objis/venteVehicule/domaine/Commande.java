/**
 * 
 */
package sn.objis.venteVehicule.domaine;

import java.util.Date;
import java.util.List;

/**
 * @author HP
 *
 */
public class Commande {
	//Proprietes
	private long idCommande;
	private Date dateCommande;
	private long idClient;
	private List<Automobile> listeAutos;
	
	
	//Constructeur
	/**
	 *Constructeur sans parametre 
	 */
	public Commande() {
		super();
	}

	
	
	public Commande(long idCommande, Date dateCommande, long idClient, List<Automobile> listeAutos) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.idClient = idClient;
		this.listeAutos = listeAutos;
	}



	//Getters et setters
	

	public long getIdCommande() {
		return idCommande;
	}

	public List<Automobile> getListeAutos() {
		return listeAutos;
	}



	public void setListeAutos(List<Automobile> listeAutos) {
		this.listeAutos = listeAutos;
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

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	
	
	
	
	
	

}
