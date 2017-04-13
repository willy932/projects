package com.formation.servlet;

import java.io.IOException;
import java.util.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.formation.dao.ClientDao;
import com.formation.entity.Client;
import com.formation.implement.CLientImpl;
import com.google.gson.Gson;

public class ListClientServlet extends HttpServlet{

	public ListClientServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClientDao cd = new CLientImpl();
		List<Client> lits = cd.getListCLient();
		String clients= new Gson().toJson(lits);
		response.setContentType("application/json");
		response.getWriter().write(clients);
		
		
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
