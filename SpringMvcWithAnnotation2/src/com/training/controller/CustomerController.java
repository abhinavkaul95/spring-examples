/**
 * 
 */
package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.entity.Customer;
import com.training.utils.CustomerDao;

/**
 * @author akaul5
 *
 */
@Controller
@RequestMapping("addCustomer")
@Import({Customer.class, CustomerDao.class})
public class CustomerController {

	@Autowired
	private ModelAndView modelView;
	@Autowired
	private Customer customer;
	@Autowired
	private CustomerDao customerDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initForm() {
		modelView.setViewName("addCustomer");
		modelView.addObject("command",customer);
		return modelView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@ModelAttribute("custAdded") Customer cust, Model mdl) {
		int rowAdded = customerDao.add(cust);
		mdl.addAttribute("rowAdded", rowAdded);
		return "Show";
	}
	
	
	@RequestMapping(value="findCustomer", method=RequestMethod.POST)
	public String findCustomer(@RequestParam("key") long key, Model model){
		System.out.println("Just above");
		Customer foundCustomer = customerDao.find(key);
		System.out.println(foundCustomer);
		model.addAttribute("foundCustomer", foundCustomer);
		return "ShowCustomer";
	}
	
	@RequestMapping(value="findAll", method=RequestMethod.POST)
	public String findCustomer(Model model){
		List<Customer> foundCustomers = customerDao.findAll();
		model.addAttribute("foundCustomers", foundCustomers);
		return "ShowAllCustomers";
	}
}
