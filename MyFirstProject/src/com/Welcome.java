package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**     
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
  @Override
public void init() throws ServletException {
	// TODO Auto-generated method stub
	super.init();
}
    
    
    int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		counter++;
		String gn = request.getParameter("Name"); //only one value will be returned
		String col[]=request.getParameterValues("colors");
		response.setContentType("text/html");
		
		if(col==null)
			response.getWriter().println("No color");
		else
		{
			for(String c: col)
			{
				System.out.println(c);
			response.getWriter().println("<font color= "+c+ gn 
				+"Welocme In Chaithra's web site>");
			
			}
		
		
		}
		response.getWriter().println("<h1>Your visitor number is :"+counter);
		if(gn.equalsIgnoreCase("chaithra"))
		{		
			RequestDispatcher requestDispatch = request.getRequestDispatcher("ValidServlet");
			requestDispatch.forward(request, response);
		}
		else
		{
			RequestDispatcher requestDispatch = request.getRequestDispatcher("InvalidServlet");
			requestDispatch.forward(request, response);
		}
}
}