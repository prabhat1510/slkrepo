package servletbasedwebapp.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletbasedwebapp.entities.Customer;
import servletbasedwebapp.service.CustomerService;
import servletbasedwebapp.service.CustomerServiceImpl;

@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{
	
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.getCustomerById(15);
		req.setAttribute("customer",customer);
		RequestDispatcher dispatcher =  req.getRequestDispatcher("customer.jsp");
		dispatcher.forward(req, resp);
}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		CustomerService customerService = new CustomerServiceImpl();
		String customerName = req.getParameter("customerName");
		
		Customer cust = new Customer();
		cust.setCustomerName(customerName);
		
		Customer customer = customerService.addCustomer(cust);
		
		req.setAttribute("customer",customer);
		
		RequestDispatcher dispatcher =  req.getRequestDispatcher("customer.jsp");
		dispatcher.forward(req, resp);
}
}