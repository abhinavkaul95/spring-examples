package com.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.model.ServiceRequest;
import com.training.utils.ServiceRequestDao;

@Controller
public class ServiceRequestController {
  
  @Autowired
  ModelAndView modelView;
  
  @Autowired
  ServiceRequest serviceRequest;
  
  @Autowired
  ServiceRequestDao dao;
  
  @RequestMapping("/")
  public String welcomePage(){
    return "index";
  }
  
  @ModelAttribute("typeList")
  public String[] getTypeList(){
	  return new String[] {"Technical", "Payment Related", "Special Offers"};
  }
  
  @RequestMapping(value = "addRequest", method = RequestMethod.GET)
  public ModelAndView displayForm(){
	modelView.setViewName("AddRequest");
	modelView.addObject("command", serviceRequest);
	return modelView;
  }
  
  @RequestMapping(value = "addRequest", method = RequestMethod.POST)
  public String addAndDisplay(@ModelAttribute("command") ServiceRequest serviceRequest){
	dao.add(serviceRequest);
    return "ViewRequest";
  }
  
  @RequestMapping(value = "viewRequest", method = RequestMethod.POST)
  public ModelAndView displayRequestById(@RequestParam("key") long key){
	ServiceRequest serviceRequest = dao.find(key);
	modelView.setViewName("ViewRequest");
	modelView.addObject("command", serviceRequest);
	return modelView;
  }
  
  @RequestMapping(value = "viewAllRequests", method = RequestMethod.POST)
  public ModelAndView displayRequests(){
	List<ServiceRequest> serviceRequests = dao.findAll();
	modelView.setViewName("ViewAllRequests");
	modelView.addObject("command", serviceRequests);
	return modelView;
  }
}
