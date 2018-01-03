package com.mibine.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorld {
	
	@RequestMapping(value = "/hello")
	public String welcome(Model model) {
		model.addAttribute("message", "Welcome");
		return "HelloWorld";
	}
}
