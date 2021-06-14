package com.securitydemo.securitydemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {
	
	@GetMapping("/hello/{name}")
	public String show(@PathVariable String name) {
		return "Hello "+name;
		
	}
	
	@GetMapping("/admin/hello")
	public String showadmin(@RequestParam String name) {
		return "Hello "+name;
		
	}

}
