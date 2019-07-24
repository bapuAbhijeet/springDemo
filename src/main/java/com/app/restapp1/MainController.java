package com.app.restapp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	@GetMapping("/welcome")
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to App";
	}
	//must match with jsp page for dependency tomcat-embed-jasper in pom
	@GetMapping("/login")
	//@ResponseBody
	public String login() {
		return "login";
		
	}
	
	@PostMapping("/validateUser")
	//@ResponseBody
	public String validateUser(
	@RequestParam("uName")String uName,
	@RequestParam("pwd")String pwd) {
		if(uName.equals("a") && pwd.equals("p")){
			return "success";
		}
		else
		{
			return "failure";
		}
	}
	
	
	
	
}
