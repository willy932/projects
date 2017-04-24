package jms.tp1.servletRecever;

import java.io.IOException;
import java.io.PrintWriter;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class consomateur
 */
@WebServlet("/consomateur")
public class consomateur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Context context;
	ConnectionFactory factory;
	Destination destination;
	Connection connection;
	Session session;
	MessageConsumer consomateur;
 
	public void init(ServletConfig config) throws ServletException {
		try {
			
			context = new InitialContext();
			 factory = (ConnectionFactory) context.lookup("jms/__defaultConnectionFactory"); 
			 destination = (Destination) context.lookup("jms/queue01");
			 connection = factory.createConnection(); 
			 session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE); 
			 consomateur = session.createConsumer(destination);      // à faire avant start() 
			 connection.start();
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Message message = consomateur.receiveNoWait();
			PrintWriter out = response.getWriter();
			out.println("message recu:"+message.getBody(String.class));
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}
	@Override
	public void destroy() {
		try {
			session.close(); connection.close(); context.close(); 
		} catch (Exception e) {			
			e.printStackTrace();
		}
		super.destroy();
	}
}
