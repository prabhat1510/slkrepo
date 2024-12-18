package serveletbasedwebapp.servlets;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import serveletbasedwebapp.model.Customer;
import serveletbasedwebapp.service.CustomerService;
import serveletbasedwebapp.service.CustomerServiceImpl;


@WebServlet("/customer")
public class CustomerServlet extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Making a call to service layer method to get customer whose id is 1
		CustomerService customerService = new CustomerServiceImpl();
		Customer customer = customerService.getCustomerById(1);
		//setting customer data from database to request attribute
		req.setAttribute("customer",customer);
		//Telling request dispatcher to send the request to customer.jsp
		RequestDispatcher dispatcher =  req.getRequestDispatcher("customer.jsp");
		dispatcher.forward(req, resp);
	}
	

}
