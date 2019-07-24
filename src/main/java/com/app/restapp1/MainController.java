package com.app.restapp1;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MainController {
	HashMap<String, String> credentials = new HashMap<>();
	
	@GetMapping("/welcome")
	@ResponseBody
	public String sayWelcome() {
		return "Welcome to App";
	}
	//must match with jsp page for dependency tomcat-embed-jasper in pom
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/")
	public String register() {
		return "register";
	}
	
	@PostMapping("/validateUser")
	//@ResponseBody
	public String validateUser(
	@RequestParam("uName")String uName,
	@RequestParam("pwd")String pwd) {
		if(pwd.equals(credentials.get(uName))){
			return "success";
		}
		else
		{
			return "failure";
		}
	}
	@PostMapping("/registerUser")
	public String registerUser(@RequestParam("uName")String uName,
			@RequestParam("pwd")String pwd){
		credentials.put(uName,pwd);
		return "login";
	}
	
}
