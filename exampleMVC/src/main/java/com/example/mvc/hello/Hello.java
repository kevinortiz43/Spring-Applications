package com.example.mvc.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/")
	public String initialHello() {
		return "Hello!";

	}

	@RequestMapping("/morning")
	public String earlyHello() {
		return "Good morning";
	}

	@RequestMapping("/afternoon")
	public String midHello() {
		return "Good Afternoon";
	}

	@RequestMapping("/evening")
	public String lateHello() {
		return "Good evening";
	}
	
	@RequestMapping("/math")
	public int math() {
		return 2+2;
	}

}

//	string value in a table through mysql http::\\
