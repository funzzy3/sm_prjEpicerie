<?xml version="1.0" encoding="UTF-8" ?>
<%@page import="com.isi.sm_prjEpicerie.entites.Categories"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Insert title here</title>
</head>
<body>
	<%
		//récupérer la arrayliste monté par l'action
		ArrayList<Categories> alV = (ArrayList<Categories>)request.getAttribute("arVehicules");
		if(alV==null){
			out.println("erreur arrayList de véhicule non  présent");
			return;
		}	
		
	%>
	<table border="1">
	<tr>
		<th>modèle</th>
		<th>année</th>
		<th>prix</th>
	</tr>
	<%for(Categories v: alV){ %>
		<tr>
			<td><%=v.getModele() %></td>
			<td><%=v.getAnnee() %></td>
			<td><%=v.getPrix() %></td>
		</tr>
	
	<%} %>
	</table>
</body>
</html>