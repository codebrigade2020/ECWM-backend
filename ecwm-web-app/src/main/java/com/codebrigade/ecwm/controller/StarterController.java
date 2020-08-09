package com.codebrigade.ecwm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.codebrigade.ecwm.bean.StarterBean;

@RestController
public class StarterController {
	
	//Testing Method 1
	@GetMapping(path= "/home")
	public String starterMessage() {
		return "App is up and running";
	}
	
	//Testing Method 2
	@RequestMapping(method=RequestMethod.GET, path= "/login/{username}/{password}")
	public String login(@PathVariable String username,@PathVariable String password) {
		
		if(username.equals("deiva") && password.equals("mani"))
		return "Login Success";
		else
		return "Login Failure";
	}
	
	//Testing Method 3
	@GetMapping(path = "/message/{message}")
	public StarterBean message(@PathVariable String message) {
		return new StarterBean(message);
	}
	

}
