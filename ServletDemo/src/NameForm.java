import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


//This extends the HttpServlet class and creates a servlet 

public class NameForm extends HttpServlet {
	
	public void doGet(HttpServletRequest request, 
		HttpServletResponse response) throws ServletException, 
		IOException {
		
		System.out.println("In doGet...");
		
		//the sets up the webpage content
		
		response.setContentType("text/html");
		
		//this writes the form content to display on the web page
		
		PrintWriter out = response.getWriter();
		String title = "Name Form";
	      String docType =
	         "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
	         
	      out.println(docType +
	         "<html>\n" +
	            "<head><title>" + title + "</title></head>\n" +
	            "<body bgcolor = \"#f0f0f0\">\n" +
	               "<h1 align = \"center\">" + title + "</h1>\n" +
	               "<ul>\n" +
	                  "  <li><b>First Name</b>: "
	                  + request.getParameter("first_name") + "\n" +
	                  "  <li><b>Last Name</b>: "
	                  + request.getParameter("last_name") + "\n" +
	               "</ul>\n" +
	            "</body>" +
	         "</html>"
	      );
	   }
	
	// This method handles the POST method request
	
	   	public void doPost(HttpServletRequest request, HttpServletResponse response)
	      throws ServletException, IOException {
	      
	      doGet(request, response);
	   }
	
	public void destroy() {
		//not using this at the moment
	}

	
	}