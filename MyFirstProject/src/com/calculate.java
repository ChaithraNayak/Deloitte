package com;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class calculate
 */
public class calculate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	String prodList[]=request.getParameterValues("prod");
    	int total=0;
    	for(String p:prodList)
    	{
    		if(p!=null)
    			total+=10;
    	}
    	System.out.println(total);
    	request.setAttribute("total",total);
    	
    	
    	
    	
    	
    	RequestDispatcher requestDispatch = request.getRequestDispatcher("finalBilling");
		requestDispatch.forward(request, response);
    }
}
