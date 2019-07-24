package com.app.restapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/Welcome")
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to App";
	}
	@GetMapping("/login")
	@ResponseBody
	public String login() {
		return "Login";
	}
	
	
	
	
	
	
}
