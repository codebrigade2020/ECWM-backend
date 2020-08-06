package com.ecwm.rest.webservices.ecwmwebapp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StarterController {
	
	@RequestMapping(method=RequestMethod.GET, path= "/home")
	public String starterMessage() {
		return "App is up and running";
	}

}
