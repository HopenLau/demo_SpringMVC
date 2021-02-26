package com.demo.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

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

}