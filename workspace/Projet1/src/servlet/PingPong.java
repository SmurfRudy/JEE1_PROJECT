package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PingPong
 */
@WebServlet("/PingPong")
public class PingPong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PingPong() {
        super();
        // TONOTDO
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session =request.getSession();
		int comptS;
		if (session.getAttribute("compteur")!=null){
			comptS++;
			session.setAttribute("compteur", comptS);
			
		} 
		else {
			comptS =0;
			session.setAttribute("compteur", comptS);
		}
		
		ServletContext context = request.getServletContext();
		int resultApp;
		if (context.getAttribute("CONTER_APP")!=null){
			Integer counterApp =(Integer)context.getAttribute("CONTER_APP");
			counterApp++;
			resultApp = counterApp;
		}
		else{
			resultApp =0;
		}
		context.setAttribute("CONTER_APP", resultApp);
		
		PrintWriter w = response.getWriter();
		String pingpongVar;
	
		w.write("Compteur Session : "+ comptS + "Compteur Application : "+ resultApp );
		w.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TONOTDO
	}

}
