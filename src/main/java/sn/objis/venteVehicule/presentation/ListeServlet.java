package sn.objis.venteVehicule.presentation;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.venteVehicule.domaine.Automobile;
import sn.objis.venteVehicule.service.IServiceAutomobileImpl;

/**
 * Servlet implementation class listeServlet
 */
public class ListeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
       
    public ListeServlet(Connection con) {
		super();
		this.con = con;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public ListeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Liste des automobile
		List<Automobile> catalogues = new ArrayList<>();
		//Etablissement de la connexion
		con = (Connection) getServletContext().getAttribute("connexion");
		IServiceAutomobileImpl service = new IServiceAutomobileImpl(con);
		catalogues = service.findAll();
		System.out.println(catalogues);
		//scope
		request.setAttribute("catalogue", catalogues);
		
		// Redirection ves la page qui dois afficher la liste
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
