package jms.tp1.servlet;

import java.io.IOException;


import javax.jms.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Queue
 */
@WebServlet("/Queue")
public class Queue extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Context context;
	ConnectionFactory factory;
	Destination destination;
	Connection connection;
	Session session;
	MessageProducer producer;
	
	public void init(ServletConfig config) throws ServletException {
		
		try {
			
			context = new InitialContext();
			 factory = (ConnectionFactory) context.lookup("jms/__defaultConnectionFactory"); 
			 destination = (Destination) context.lookup("jms/queue01");
			 connection = factory.createConnection(); 
			 session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE); 
			 producer = session.createProducer(destination);      // à faire avant start() 
			 connection.start();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String messageParam = request.getParameter("msg");
		TextMessage message;
		if(messageParam != null){
			try {
				message = session.createTextMessage();
				message.setText(messageParam); 
				producer.send(message); 
			} catch (JMSException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
	}
	@Override
	public void destroy() {
		try{
			connection.close(); session.close(); context.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		super.destroy();
	}
	

}
