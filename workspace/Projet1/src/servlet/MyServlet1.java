package servlet;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet1
 */
@WebServlet("/welcome")
public class MyServlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public MyServlet1() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String value1 = request.getParameter("param1");
		String value2 = request.getParameter("param2");
		String value3 = request.getParameter("param3");
		
		/*Exemple correction exo1
		 * String responseWebBrowser = "";
		for (Entry<String, String[]> elt : request.getParameterMap().entrySet()){
			String it ="<li>" +elt.getValue()[0] +"</li>";
			responseWebBrowser = responseWebBrowser+it;
					
		}*/
		
		PrintWriter w = response.getWriter();
		w.write("<html><body><h1></h1><h2>Info Param</h2>Valeur 1 : "+value1+"<br />Valeur 2 : "+value2+
				"<br />Valeur 3 : "+value3+"<br /><h2>Info Web Browser</h2> Remote add : "+request.getRemoteAddr()+
				"<br />Protocole : "+request.getProtocol()+"<br />ContextPath : "+request.getContextPath()+
				"<br />Localhost : "+request.getLocalAddr()+"<br />URI : "+request.getRequestURI()+
				"</body></html>");
		w.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Do nothing
	}

}
