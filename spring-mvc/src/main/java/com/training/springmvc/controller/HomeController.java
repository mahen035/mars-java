package com.training.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	//@RequestMapping(method=RequestMethod.GET)
	//@GetMapping
	//public String greet() {
		
	//	return "home";
	//}
	
	//@RequestMapping(value="/etc", method=RequestMethod.GET)
	@GetMapping("/etc")
	public String display() {
		return "etc";
	}
	

}
