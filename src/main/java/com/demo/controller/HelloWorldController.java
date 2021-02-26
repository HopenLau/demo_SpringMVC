package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	@RequestMapping("/mvc")
	// 對應於host:8080/hello/mvc
	public String helloWorld() {
		System.out.println("controller.HelloWorldController.helloWorld() {\r\n" + "	["
				+ new java.text.SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS").format(new java.util.Date()) + "]");
		
		System.out.println("}\r\n");
		return "home";
	}

}
