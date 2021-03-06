package sn.objis.venteVehicule.presentation;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.venteVehicule.service.PresenteTroisVehicule;

/**
 * Servlet implementation class CatalogueServlet
 */
public class CatalogueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con ;
       
    public CatalogueServlet(Connection con) {
		super();
		this.con = con;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public CatalogueServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Etablissement de la connexion
		con = (Connection) getServletContext().getAttribute("connexion");
		
		PresenteTroisVehicule presentation = new PresenteTroisVehicule(con);
		
		
		//scop
		request.setAttribute("catalogue",presentation.presente());
		
		request.getRequestDispatcher("client/catalogue.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
