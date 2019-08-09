package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.dao.impl.CustomerDAOImpl;
import com.delloite.cms.model.Customer;

/**
 * Servlet implementation class CustomerDetatilsServlet
 */
public class CustomerDetatilsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDetatilsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int customerId = Integer.parseInt(request.getParameter("customerId"));
		String customerName = request.getParameter("customerName");
		String customerAddress = request.getParameter("customerAddress");
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
		
		Customer customer = new Customer(customerId,customerName,customerAddress,billAmount);
		CustomerDAO customerDAO= new CustomerDAOImpl();
		
		boolean result = customerDAO.insertCustomer(customer);
		
		if(result)
			response.getWriter().println("<h2>"+customerName+"Your records are updated");
		else
			response.getWriter().println("<h2>"+customerName+"Sorry there was a problem, we couldn't load your data.");
		
		response.getWriter().println("Customer Details :");
		response.getWriter().println("\n CustomerId is :"+customerId);
		response.getWriter().println("\n CustomerName is :"+customerName);
		response.getWriter().println("\n CustomerAddress is :"+customerAddress);
		response.getWriter().println("\n Billamount is :"+billAmount);
		
		
	}

}
