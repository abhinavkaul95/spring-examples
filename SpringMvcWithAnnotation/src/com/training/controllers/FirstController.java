/**
 * 
 */
package com.training.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author akaul5
 *
 */
@Controller
public class FirstController {
	
  @RequestMapping("/")
  public String welcomePage(){
	  return "index";
  }
}
