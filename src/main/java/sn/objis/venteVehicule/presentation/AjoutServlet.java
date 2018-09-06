package sn.objis.venteVehicule.presentation;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.objis.venteVehicule.domaine.Automobile;



/**
 * Servlet implementation class AjoutServlet
 */
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	File f;
	FileInputStream istreamImage = null;
	
       
    public AjoutServlet(Connection con) {
		super();
		this.con = con;
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Recuperation des valeurs saisies
		
		String moteur = request.getParameter("moteur");
		String marque = request.getParameter("marque");
		String model = request.getParameter("model");
		String couleur = request.getParameter("couleur");
		double prix    = Double.parseDouble(request.getParameter("prix"));
		int  nbrPlace  = Integer.parseInt(request.getParameter("nombre"));
		String descrip = request.getParameter("description");
		String file = request.getParameter("photo");
		String type = request.getParameter("auto");
		
		
		
		//Etablissement de la connexion
		con = (Connection) getServletContext().getAttribute("connexion");
		//IServiceAutomobileImpl service = new IServiceAutomobileImpl(con);
		//CreationAuto creer = new CreationAuto(con);
		Automobile auto = new Automobile( moteur, marque, model, couleur, prix, nbrPlace, descrip, type, file);
		//creer.creerAutomobile(auto);

		// Utilisation d'un scope pour afficher
		
		// Redirection
		RequestDispatcher rd = request.getRequestDispatcher("client/formulaire.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}

}
