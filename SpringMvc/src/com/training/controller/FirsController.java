/**
 * 
 */
package com.training.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author akaul5
 *
 */
public class FirsController implements Controller {

	@Autowired
	private ModelAndView modelView;
	
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
		String msg = "Welcome to Spring MVC";
		modelView.addObject("msg",msg);
		modelView.setViewName("Success");
		return modelView;
	}

}
