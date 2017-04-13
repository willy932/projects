package com.formation.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.formation.dao.ClientDao;
import com.formation.entity.Client;
import com.formation.implement.CLientImpl;
import com.google.gson.Gson;

public class AngularJsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AngularJsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientDao cd = new CLientImpl();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String tel = request.getParameter("tel");
		String mail = request.getParameter("mail");
		Client a = new Client(nom, prenom, tel, mail);
		cd.InsertClient(a);
		String statut = "client enregistrer" ; 
		response.setContentType("application/json");
		response.getWriter().write(new Gson().toJson(statut));
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
