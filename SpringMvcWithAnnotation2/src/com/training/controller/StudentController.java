package com.training.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.training.exceptions.RangeCheckException;

@Controller
public class StudentController {
	
	@Autowired
	private ModelAndView modelView;
	
	@RequestMapping(value="/getStudentDetails", method=RequestMethod.GET)
	public String displayForm(){
		return "GetStudentDetails";
	}
	
	@RequestMapping(value="/getStudentDetails", method=RequestMethod.POST)
	public String findStudent(@RequestParam int rollNumber) throws RangeCheckException{
		String nextSteps = "StudentDetails";
		if(rollNumber > 1000 || rollNumber <=0){
			throw new RangeCheckException(rollNumber);
		}
		return nextSteps;
	}
	
	@ExceptionHandler(RangeCheckException.class)
	public ModelAndView errorHandler(HttpServletRequest req, Exception exc) {
		modelView.addObject("cause", exc.getMessage());
		modelView.addObject("exceptionClass", exc.getClass());
		modelView.addObject("requestURI",req.getRequestURI());
		modelView.setViewName("Bugs");
		return modelView;
	}
}
