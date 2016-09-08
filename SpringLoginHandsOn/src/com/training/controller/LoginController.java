/**
 * 
 */
package com.training.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author akaul5
 *
 */
@Controller
public class LoginController {
  
	@RequestMapping("/")
	public String welcomePage(){
		return "index";
	}
	
	@RequestMapping("log")
	public String loginPage(){
		return "Login";
	}
}
