package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class HomeController {
	public String WelcomeHome() {
		return "Welcome Home Manjiri";
	}
}
