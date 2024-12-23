package com.training.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.demo.model.Customer;
import com.training.demo.service.CustomerService;

@Controller
public class CustomerController {
	@Autowired
	private CustomerService service;

	// http://localhost:8081/getcustomerform
	// To add new customer we need to load empty customer form
	@RequestMapping(value = "/getcustomerform", method = RequestMethod.GET)
	public ModelAndView getCustomerForm(@ModelAttribute Customer customer) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("customerform");
		return mv;
	}

	// Add customer functionality - On submit of customer form below method will be
	// called
	// http://localhost:8081/addcustomer
	@RequestMapping(value = "/addcustomer", method = RequestMethod.POST)
	public ModelAndView addCustomer(@ModelAttribute Customer customer) {
		String message = service.addCustomer(customer);
		ModelAndView mv;
		if (message != null) {
			mv = new ModelAndView();
			mv.addObject("successmsg", message);
			mv.setViewName("success");
			return mv;
		} else {
			mv = new ModelAndView();
			mv.addObject("errormsg", "Unable to add customer");
			mv.setViewName("error");
			return mv;
		}
	}

	// http://localhost:8081/searchcustomerform
	// Search customer functionality - On search customer form with option to enter
	// an customer id is displayed
	@RequestMapping(value = "/searchcustomerform", method = RequestMethod.GET)
	public ModelAndView searchCustomerForm(@ModelAttribute Customer customer) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("searchcustomerform");
		return mv;
	}

	// Search customer functionality - On submit of search customer form below
	// method will be called
	// http://localhost:8081/searchcustomer
	@RequestMapping(value = "/searchcustomer", method = RequestMethod.POST)
	//@PostMapping("/searchcustomer")
	public ModelAndView searchCustomer(@ModelAttribute Customer customer) {
		Customer cust = service.getCustomerById(customer.getCustId());
		ModelAndView mv;
		if (cust != null) {
			mv = new ModelAndView();
			mv.addObject("customer", cust);
			mv.setViewName("customersuccess");
			return mv;
		} else {
			mv = new ModelAndView();
			mv.addObject("errormsg", "Unable to find customer by id " + customer.getCustId());
			mv.setViewName("error");
			return mv;
		}
	}

	// Directly in request we are sending customer id as a parameter
	// http://localhost:8081/getcustomerbyid?id=1
	@RequestMapping(value = "/getcustomerbyid", method = RequestMethod.GET)
	//@GetMapping("/getcustomerbyid")
	public ModelAndView getCustomerById(@RequestParam("id") Integer custId) {
		Customer customer = service.getCustomerById(custId);
		ModelAndView mv;
		if (customer != null) {
			mv = new ModelAndView();
			mv.addObject("customer", customer);
			mv.setViewName("customersuccess");
			return mv;
		} else {
			mv = new ModelAndView();
			mv.addObject("errormsg", "Unable to find customer by id " + custId);
			mv.setViewName("error");
			return mv;
		}
	}

	// http://localhost:8081/customerbyid/1
	@RequestMapping(value = "/customerbyid/{id}", method = RequestMethod.GET)
	public ModelAndView getCustByIdUsingPathVariable(@PathVariable("id") Integer custId) {
		Customer customer = service.getCustomerById(custId);
		ModelAndView mv;
		if (customer != null) {
			mv = new ModelAndView();
			mv.addObject("customer", customer);
			mv.setViewName("customersuccess");
			return mv;
		} else {
			mv = new ModelAndView();
			mv.addObject("errormsg", "Unable to find customer by id " + custId);
			mv.setViewName("error");
			return mv;
		}
	}

}
