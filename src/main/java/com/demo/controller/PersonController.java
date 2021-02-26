package com.demo.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.demo.entity.Person;

@Controller
@RequestMapping("/person")
public class PersonController {

	@RequestMapping(value = "/upload", method = RequestMethod.GET)
	public String showUploadPage() {
		// 跳轉到"/jsp/uploadFile.jsp"。
		return "uploadFile";
	}

	@RequestMapping(value = "/doUpload", method = RequestMethod.POST)
	public String doUploadFile(@RequestParam("file") MultipartFile file) throws IOException {

		if (!file.isEmpty()) {
			// 若果有文件。
			System.out.println("Process file:{" + file.getOriginalFilename() + "}");

			// 放喺D盤。
			FileUtils.copyInputStreamToFile(file.getInputStream(),
					new File("d:\\temp\\upload\\", System.currentTimeMillis() + "_" + file.getOriginalFilename()));
		}

		return "success";
	}


	// 將url同方法名進行 映射。
	// 一般建議將url同方法名寫成一樣。
	@RequestMapping("/queryItems")
	public ModelAndView queryItems() throws Exception{
		// 調用service層。

		List<Person> lstPerson = new ArrayList<Person>();

		Person p = new Person();
		p.setId(1);
		p.setName("Kwangchow");
		p.setAge(20);

		p = new Person();
		p.setId(2);
		p.setName("Hong Kong");
		p.setAge(18);

		ModelAndView modleAndView = new ModelAndView();
		// 相當於request嘅setAttribute。
		modleAndView.addObject("lstPerson", lstPerson);

		// 指定視圖。
		modleAndView.setViewName("/WEB-INF/jsp/personList.jsp");
		return modleAndView;
		
	}
	
	
//	@Override
//	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		// 調用service層。
//
//		List<Person> lstPerson = new ArrayList<Person>();
//
//		Person p = new Person();
//		p.setId(1);
//		p.setName("Kwangchow");
//		p.setAge(20);
//
//		p = new Person();
//		p.setId(2);
//		p.setName("Hong Kong");
//		p.setAge(18);
//
//		ModelAndView modleAndView = new ModelAndView();
//		// 相當於request嘅setAttribute。
//		modleAndView.addObject("lstPerson", lstPerson);
//
//		// 指定視圖。
//		modleAndView.setViewName("/WEB-INF/jsp/personList.jsp");
//		return modleAndView;
//	}

}