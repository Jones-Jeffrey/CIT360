import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


//This extends the HttpServlet class and creates a servlet 

public class NewServletDemo extends HttpServlet {
	
		private String mymsg;
		
	
	public void init() throws ServletException {
		mymsg = "Welcome!";
	}
	
	public void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, 
		IOException {
		
		System.out.println("In doGet...");
		
		//the sets up the webpage content
		
		response.setContentType("text/html");
		
		//this writes the message to the webpage
		
		PrintWriter out = response.getWriter();
	      out.println("<h1>" + mymsg + "</h1>");
	   }
	
	
	public void destroy() {
		//not using this at the moment
	}

	
	}