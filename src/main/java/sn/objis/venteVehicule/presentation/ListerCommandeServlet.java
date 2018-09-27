package sn.objis.venteVehicule.presentation;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.venteVehicule.service.CommandePassee;

/**
 * Servlet implementation class ListerCommandeServlet
 */
public class ListerCommandeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public ListerCommandeServlet(Connection con) {
		super();
		this.con = con;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ListerCommandeServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Etablissement de la connexion
		con = (Connection) getServletContext().getAttribute("connexion");

		CommandePassee listeCommande = new CommandePassee(con);

		// scop
		request.setAttribute("commande", listeCommande.visualiserCommande());

		request.getRequestDispatcher("admin/commande.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
