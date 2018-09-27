package sn.objis.venteVehicule.domaine;

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
	private String auto;
	private String emailClient;
	private String telClient;
	
	
	
	
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

	public Commande(String dateCommande, String auto, String emailClent, String telClient) {
		super();
		this.dateCommande = dateCommande;
		this.emailClient=emailClent;
		this.setAuto(auto);
		this.telClient=telClient;
		
	}

	public Commande(long idCommande, String dateCommande, String auto, String emailClient, String telClient) {
		super();
		this.idCommande = idCommande;
		this.dateCommande = dateCommande;
		this.auto = auto;
		this.emailClient = emailClient;
		this.telClient = telClient;
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

	public String getAuto() {
		return auto;
	}

	public void setAuto(String auto) {
		this.auto = auto;
	}

	public String getEmailClient() {
		return emailClient;
	}

	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}

	public String getTelClient() {
		return telClient;
	}

	public void setTelClient(String telClient) {
		this.telClient = telClient;
	}

	

	

	

	
	
	
	
	
	
	
	

}
