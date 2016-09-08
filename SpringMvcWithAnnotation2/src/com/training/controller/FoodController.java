/**
 * 
 */
package com.training.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.training.models.Food;

/**
 * @author akaul5
 *
 */
@Controller
@RequestMapping("/addFood")
public class FoodController {

	@Autowired
	private ModelAndView modelView;
	
	@Autowired
	private Food food;
	
	@ModelAttribute("cuisineData")
	public String[] getCuisine(){
		return new String[] {"Indian","French","Continental","Chinese"};
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initForm() {
		modelView.setViewName("addFood");
		modelView.addObject("command",food);
		return modelView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid @ModelAttribute("command") Food food, BindingResult result) {
		if(result.hasErrors()){
			return "addFood";
		}
		else{
			return "Welcome";
		}
		}
	
}
