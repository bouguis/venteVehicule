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
import sn.objis.venteVehicule.service.CreationAutoElectrique;
import sn.objis.venteVehicule.service.CreationAutoEssence;
import sn.objis.venteVehicule.service.PresenteTroisVehicule;
/**
 * Servlet implementation class AjoutServlet
 */
public class AjoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	File f;
	FileInputStream istreamImage = null;
	Automobile auto;
	
       
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
		request.getRequestDispatcher("client/formulaire.jsp").forward(request, response);
		//Etablissement de la connexion
		con = (Connection) getServletContext().getAttribute("connexion");
		
//		CreationAutoElectrique electrique = new CreationAutoElectrique(con);
//		CreationAutoEssence essence = new CreationAutoEssence(con);
		PresenteTroisVehicule presentation = new PresenteTroisVehicule(con);
		
		// Utilisation d'un scope pour afficher
		request.setAttribute("catalogue", presentation.presente() );
		
		
		// Redirection
		RequestDispatcher rd = request.getRequestDispatcher("admin/acceuil.jsp");
		rd.forward(request, response);
				
		
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
		
		CreationAutoElectrique electrique = new CreationAutoElectrique(con);
		CreationAutoEssence essence = new CreationAutoEssence(con);
		auto = new Automobile();
		if (type.equalsIgnoreCase("essence")) {
			auto.setMoteur(moteur);
			auto.setMarque(marque);
			auto.setModel(model);
			auto.setCouleur(couleur);
			auto.setPrix(prix);
			auto.setNbrPlace(nbrPlace);
			auto.setDescription(descrip);
			auto.setPhoto(file);
			auto.setType(type);
			essence.creerAutomobile(auto);
			// Utilisation d'un scope pour afficher
			request.setAttribute("catalogue", essence.findAll() );
			
		}else if (type.equalsIgnoreCase("electrique")) {
			auto.setMoteur(moteur);
			auto.setMarque(marque);
			auto.setModel(model);
			auto.setCouleur(couleur);
			auto.setPrix(prix);
			auto.setNbrPlace(nbrPlace);
			auto.setDescription(descrip);
			auto.setPhoto(file);
			auto.setType(type);
			electrique.creerAutomobile(auto);
			
			// Utilisation d'un scope pour afficher
			request.setAttribute("catalogue", electrique.findAll() );
			
			
		}else {
			System.out.println("Veuillez choisir Essence ou Electrique");
		}
		
		// Redirection
		RequestDispatcher rd = request.getRequestDispatcher("admin/acceuil.jsp");
		rd.forward(request, response);
		
		
		
		
		
	}

}
