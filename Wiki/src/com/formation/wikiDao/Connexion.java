package com.formation.wikiDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connexion {

	
	private static final String _strClassName = "com.mysql.jdbc.Driver";
	private static final String _connectionString="jdbc:mysql://localhost:3306/wiki";
	private static Connection _conn = null;
	public static Connection getConnection() 
	{
		if(_conn==null)
		{
			try {
				Class.forName(_strClassName);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				_conn = DriverManager.getConnection(_connectionString, "root", "willy93270");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return _conn;
	}
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection _conn=getConnection();
		//System.out.println(_conn);
		
	}

}
