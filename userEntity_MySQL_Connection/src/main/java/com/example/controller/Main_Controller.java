package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/example")
public class Main_Controller {
	
	@Autowired
	private UserRepository userRepository
	
	
	@PostMapping("/add")
	public @ResponseBody String addNewUser(@RequestParam String name, @RequestParam String email)
	
	
	

}
