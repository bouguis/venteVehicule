package sn.objis.venteVehicule.presentation;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.service.CreationAutoEssence;
import sn.objis.venteVehicule.service.VisionVehicule;



/**
 * Servlet implementation class EditerServlet
 */
public class EditerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	

	public EditerServlet(Connection con) {
		super();
		this.con = con;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Automobile autoRechercher =null;
		// Recuperation de l'identifiant
		int idEdit = Integer.parseInt(request.getParameter("idEdit"));
		// Etablissement de la connexion
		con = (Connection) getServletContext().getAttribute("connexion");
		// Instantiation service
		//CreationAutoEssence essence = new CreationAutoEssence(con);
		VisionVehicule vision = new VisionVehicule(con);
		// recherche du client
		autoRechercher = vision.decrit(idEdit);
		// Ajout des donnees dans un scope
		request.setAttribute("auto", autoRechercher);
		// Redirection
		RequestDispatcher rd = request.getRequestDispatcher("client/detail.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
	}

}
