package com.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

@RequestMapping("/log")
public String getLoginData1(@RequestParam("username")String username, @RequestParam("password")String password) {
	return "loginSuccess";	
	}

@RequestMapping("/register")
public String getRegistrationData(@RequestParam("fname")String fname, @RequestParam("lname")String lname,@RequestParam("email")String email, @RequestParam("password")String password) {	
{
	return "login";	
}	
}
}
