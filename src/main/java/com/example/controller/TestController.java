package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test")
	public String s( ) {
		return "Welcome..!"
				+ "Hello build from jenkins with Web Hooks And added the health Check.";
	}
	
}
