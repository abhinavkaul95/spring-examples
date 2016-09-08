/**
 * 
 */
package com.training.handlers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author akaul5
 *
 */
@ControllerAdvice
public class GlobalExceptionHandler {
  
  @Autowired
  ModelAndView modelView;
  
  @ExceptionHandler(value = DuplicateKeyException.class)
  public ModelAndView defaultErrorHandler(HttpServletRequest req, Exception exc) throws Exception {
    modelView.setViewName("GlobalError");
    modelView.addObject("cause", exc.getMessage());
	modelView.addObject("exceptionClass", exc.getClass());
	modelView.addObject("requestURI",req.getRequestURI());
    return modelView;
  } 
}
