package sn.objis.venteVehicule.presentation;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.service.CreationAutoElectrique;
import sn.objis.venteVehicule.service.CreationAutoEssence;

/**
 * Servlet implementation class AcceuilServlet
 */
public class AcceuilServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;

	public AcceuilServlet(Connection con) {
		super();
		this.con = con;
	}

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AcceuilServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Etablissement de la connexion
				con = (Connection) getServletContext().getAttribute("connexion");

				CreationAutoElectrique electrique = new CreationAutoElectrique(con);
				CreationAutoEssence essence = new CreationAutoEssence(con);
				
				// Utilisation d'un scope pour afficher
				request.setAttribute("catalogue", essence.findAll());
				request.setAttribute("catalogue", electrique.findAll());
				
				request.getRequestDispatcher("index.jsp").forward(request, response);
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
