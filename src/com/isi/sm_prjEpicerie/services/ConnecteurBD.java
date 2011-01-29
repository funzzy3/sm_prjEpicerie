package com.isi.sm_prjEpicerie.services;

import java.sql.*;

public class ConnecteurBD {
	 Connection conn;
	    String connStr;
	    
	    public ConnecteurBD(String driver, String connStr){
	        this.connStr = connStr;
	        conn=null;
	        //Loader le driver
	        try{
	        Class.forName(driver);
	        }
	        catch(ClassNotFoundException ex){
	            System.out.println("erreur de driver "+ ex.getMessage());
	        }
	    }
	    
	    public boolean ouvrirConnection(){
	        boolean isOK;
	        try{
	            conn= DriverManager.getConnection(connStr);
	            isOK= true;
	        }
	        catch(SQLException ex){
	            System.out.println("erreur de connection "+ ex.getMessage());
	            isOK= false;
	        }
	        return isOK;
	    } 
	    
	    public void fermerConnection(){
	        try{
	            conn.close();
	        }
	        catch(SQLException ex){
	            System.out.println("erreur de fermeture de connection "+ ex.getMessage());
	        }
	    }
	    
	    public Connection getConn(){
	        return conn;
	    }
	    public PreparedStatement getPreparedStatement(String sqlReq){
	        
	        try{
	            if(conn==null || conn.isClosed()){
	                this.ouvrirConnection();
	            }
	            PreparedStatement ps = conn.prepareStatement(sqlReq);
	            return ps;
	        }
	        catch(SQLException ex){
	            System.out.println("erreur de preparedstatement "+ ex.getMessage());
	            return null;
	        }
	    }
	
}
