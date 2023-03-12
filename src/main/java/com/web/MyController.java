package com.web;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String index() 
	{
		return "home";
	}
	
	@RequestMapping("/result")
	public String result(@RequestParam String name, @RequestParam String psw,
		                ModelMap m) {
		if(name=="sathya" && psw=="sathya") {
			System.out.println("Welcome Sathya...");
		}
		else {
			System.out.println("Invalid User name & password");
		}
		m.put("name", name);
		return "result";
	}
	}