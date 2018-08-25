package sn.objis.venteVehicule.listener;

import java.sql.Connection;

import java.sql.SQLException;


import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.sql.DataSource;

/**
 * Application Lifecycle Listener implementation class ConnectionBDListener
 *
 */
@WebListener
public class ConnectionBDListener implements ServletContextListener {

	// Declaration de attributs
	private static Connection con = null;
	private static DataSource ds = null;

	/**
	 * Default constructor.
	 */
	public ConnectionBDListener() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent arg0) {

		try {
			System.out.println("Destruction du contexte de l'application");
			// Recupération de la connexion à partir du contexte
			Connection con = (Connection) arg0.getServletContext().getAttribute("connexion");
			// Fermiture de la connection
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent arg0) {

		try {
			// Etape1: Recupération d'une reference vers la source de donnée
			Context cntx = new InitialContext();
			ds = (DataSource) cntx.lookup("java:jboss/AutoDS");

			// Etape2:Récuperation d'une connexion à partir du pool de connexion
			con = ds.getConnection();
			System.out.println("Connexion établie avec succès !!!!");
			// Etape 3: Ajout de la connexion dans le contexte
			arg0.getServletContext().setAttribute("connexion", con);

		} catch (NamingException e) {
			System.out.println("Erreur nom jndi !!");
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
