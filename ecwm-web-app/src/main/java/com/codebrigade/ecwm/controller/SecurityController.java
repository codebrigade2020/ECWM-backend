package com.codebrigade.ecwm.controller;

import java.security.Principal;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	   @PreAuthorize("hasRole('group1')")
	   @RequestMapping("/")
	   public String login(Principal principal) {
		   return principal.getName()+ " logged in";
	   }
	   
}
