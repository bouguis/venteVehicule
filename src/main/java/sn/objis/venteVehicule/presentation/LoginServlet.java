package sn.objis.venteVehicule.presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	public enum roles {
		admin, user, manager

	}

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("client/login.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Recuperation des valeurs saisies
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		RequestDispatcher rd;

		try {
			// Transmission des valeurs au serveur pour pour l'authentification
			request.login(login, password);
			// Redirection vers l'espace de travail des utilisateurs
			if (request.isUserInRole(roles.admin.toString())) {
				rd = request.getRequestDispatcher("admin/formulaire.jsp");
				rd.forward(request, response);

			}  else {
				rd = request.getRequestDispatcher("admin/login.jsp");
				rd.forward(request, response);
			}
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println("Erreur d'authentification !!");
			rd = request.getRequestDispatcher("client/login.jsp");
			rd.forward(request, response);
		}

	}

}
