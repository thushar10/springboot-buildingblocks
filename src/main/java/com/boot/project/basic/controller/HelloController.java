package com.boot.project.basic.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.project.basic.model.UserDetails;

@RestController
public class HelloController {

	//uri 
//	@RequestMapping(method=RequestMethod.GET, path="/helloWorld" )
	@GetMapping("/helloWorld1")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/userDetails")
	public UserDetails getUserDetails() {
		UserDetails userDetails = new UserDetails("Nikita", "Mittal", "Bangalore");
		return userDetails;
	}
}
