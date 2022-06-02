package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.entity.userEntity;
import com.example.service.UserService;

@Controller
@RequestMapping(path = "/mapping/")
public class UserController {

	@Autowired
	private UserService service;

	@GetMapping(path = "/error")
	public String error() {
		return "error";
	}

	@GetMapping(path = "/hello")
	public String hello() {
		return "helloWorld";
	}

	@GetMapping("/listusers")
	public String showUsers(Model model) {
		return "html";
	}

	@PostMapping("/adduser")
	public String addUser(Model model, @Valid userEntity user, BindingResult result) {

		if (result.hasErrors()) {
			return "userEntity";
		}
		
		service.addUser(user);
		
		return "redirect:/";
	}

}
