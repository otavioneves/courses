package com.otavio.course.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController implements ErrorController{
	
	@GetMapping("/")
	public String home() {
		return "/home";		// solicita que abra a página home.html
	}
	
    @RequestMapping("/error")
    @ResponseBody
    public String getErrorPath() {
        return "No Mapping Found";
    }
}
