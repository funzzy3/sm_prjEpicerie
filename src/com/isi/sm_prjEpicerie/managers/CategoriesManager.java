package com.isi.sm_prjEpicerie.managers;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.isi.sm_prjEpicerie.entites.Categories;
import com.isi.sm_prjEpicerie.services.ConnecteurBD;

public class CategoriesManager {
	private ConnecteurBD conn;
	private String table;
	
	/**
	 * @param conn : objet ConnecteurBD
	 */
	public CategoriesManager(ConnecteurBD conn, String table) {
		this.conn = conn;
		this.table = table;
	}
	
	/**
	 * Methode qui permet de recuperer la liste de toutes les categories
	 */
	public ArrayList<Categories> getAllCategories(){
		ArrayList<Categories> alC = new ArrayList<Categories>();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		ps = conn.getPreparedStatement("select * from "+table);
		try {
			rs = ps.executeQuery();
			while(rs.next()){
				Categories c = new Categories();
				c.setDescriptionCategorie(rs.getString("descriptionCategorie"));
				c.setImage(rs.getString("image"));
				c.setNoCategorie(rs.getInt("noCategorie"));
				alC.add(c);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally{
			try {
				rs.close();
				ps.close();
				conn.fermerConnection();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return alC;
	}
}
