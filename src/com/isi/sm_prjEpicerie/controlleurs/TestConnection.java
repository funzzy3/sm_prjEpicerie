package com.isi.sm_prjEpicerie.controlleurs;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isi.sm_prjEpicerie.services.ConnecteurBD;

/**
 * Servlet implementation class TestConnection
 */
public class TestConnection extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestConnection() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		ServletContext sc = config.getServletContext();
		String driver= sc.getInitParameter("bdDriver");
		String connStr = sc.getInitParameter("bdConnStr");
		
		ConnecteurBD conn = new ConnecteurBD(driver, connStr);
	
		//test la connection
		if(conn.ouvrirConnection()){
			System.out.println("connexion OK");
		}
		else{
			System.out.println("connexion PAS OK");
		}
		
		conn.fermerConnection();
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
