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
	private String dateCommande;
	private Client client;
	private List<Automobile> listeAutos;
	private Automobile auto;
	private long idAuto;
	
	
	
	//Constructeur
	/**
	 *Constructeur sans parametre 
	 */
	public Commande() {
		super();
	}

	public Commande(long idCommande, String dateCommande, Client client, List<Automobile> listeAutos) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
		this.listeAutos = listeAutos;
	}

	public Commande(String dateCommande, Client client, Automobile auto) {
		super();
		this.dateCommande = dateCommande;
		this.client = client;
		this.auto = auto;
	}

	public Commande(long idCommande, String dateCommande, Client client) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.client = client;
	}
	

	public Commande(String dateCommande, Client client) {
		super();
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

	public String getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	

	public Automobile getAuto() {
		return auto;
	}

	public void setAuto(Automobile auto) {
		this.auto = auto;
	}

	public long getIdAuto() {
		return idAuto;
	}

	public void setIdAuto(long idAuto) {
		this.idAuto = idAuto;
	}

	
	
	
	
	
	

}
