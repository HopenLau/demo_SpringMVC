package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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


//	@RequestMapping("/edit",method= {RequestMethod.POST,RequestMethod.GET})
//	//使用@RequestParam，指定request傳入參數id，同形參item_id進行綁定。
//	//通過required屬性，指定參數是否必須要傳入。
//	//通過defaultValue設置默認值。
//	public String edit(@RequestParam(value="id",required=true,defaultValue=0) Integer item_id) throws Exception{
//		
//		model.addAttribute("id",item_id)
//		
//		return "edit";
//	}
//
//	public String editSubmit(PersonVO personVo) throws Exception {
//
//		personService.update(personVo);
//		
//		// 頁面轉發
//		return "redirect:list.action";
//	}
	
}
