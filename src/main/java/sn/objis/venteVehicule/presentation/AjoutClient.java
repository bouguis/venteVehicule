package sn.objis.venteVehicule.presentation;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.venteVehicule.dao.IDaoClientImpl;
import sn.objis.venteVehicule.domaine.Client;
import sn.objis.venteVehicule.service.CommandePassee;

/**
 * Servlet implementation class AjoutClient
 */
public class AjoutClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public AjoutClient(Connection con) {
		super();
		this.con = con;

	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AjoutClient() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Redirection
		RequestDispatcher rd = request.getRequestDispatcher("client/formulaireClient.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Recuperation des valeurs saisies

		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String sexe = request.getParameter("sexe");
		String adresse = request.getParameter("adresse");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		String codeClient = request.getParameter("code");

		// Etablissement de la connexion
		con = (Connection) getServletContext().getAttribute("connexion");
		CommandePassee ajoutclient = new CommandePassee(con);
		// IDaoClientImpl ajoutclient = new IDaoClientImpl(con);

		Client client = new Client(nom, prenom, sexe, adresse, email, tel, codeClient);
		ajoutclient.ajoutClient(client);

		// Redirection
		RequestDispatcher rd = request.getRequestDispatcher("client/acceuil.jsp");
		rd.forward(request, response);

	}

}
