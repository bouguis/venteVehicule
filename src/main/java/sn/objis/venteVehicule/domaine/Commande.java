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
	private Client client;
	private List<Automobile> listeAutos;
	
	
	
	//Constructeur
	/**
	 *Constructeur sans parametre 
	 */
	public Commande() {
		super();
	}

	public Commande(long idCommande, Date dateCommande, Client client, List<Automobile> listeAutos) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
		this.listeAutos = listeAutos;
	}

	public Commande(Date dateCommande, Client client) {
		super();
		this.dateCommande = dateCommande;
		this.client = client;
	}

	public Commande(long idCommande, Date dateCommande, Client client) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	
	
	
	
	
	

}
