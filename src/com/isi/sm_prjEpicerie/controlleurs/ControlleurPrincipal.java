package com.isi.sm_prjEpicerie.controlleurs;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.isi.sm_prjEpicerie.entites.Categories;
import com.isi.sm_prjEpicerie.managers.CategoriesManager;
import com.isi.sm_prjEpicerie.services.ConnecteurBD;


/**
 * Servlet implementation class ControlleurPrincipal
 */
public class ControlleurPrincipal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CategoriesManager cm;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControlleurPrincipal() {
        super();
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		ServletContext sc = config.getServletContext();
		
		String driver = sc.getInitParameter("bdDriver");
		String connStr = sc.getInitParameter("bdConnStr");
		String tableCategories = sc.getInitParameter("tableCategories");
		
		//instancier les services
		ConnecteurBD conn = new ConnecteurBD(driver, connStr);
		
		cm = new CategoriesManager(conn, tableCategories);
		
		//instancier les actions
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pageToGo="/index.jsp";
		//r�cup�rer la jobToDo demand�e
		String job = request.getParameter("jobToDo");
		
		//executer l'action responsable de cette job
		if(job.equals("epicerie")){
			//listerVehiculeA.produireListeVehicule(request);
			//pageToGo = listerVehiculeA.getDestination();
			ArrayList<Categories> alC = cm.getAllCategories();
			
			for(Categories c : alC){
				System.out.println(c.getNoCategorie());
				System.out.println(c.getImage());
				System.out.println(c.getDescriptionCategorie());
			}
		}
		
		//passer la main au view (page jsp) qui doit afficher le r�sultat de l'action
		//transf�rer (sans retourner au client) request et response
		// au view de destination
	/*	ServletContext sc = this.getServletContext();
		RequestDispatcher rd = sc.getRequestDispatcher(pageToGo);
		rd.forward(request, response);
	*/	
		
	}

}
