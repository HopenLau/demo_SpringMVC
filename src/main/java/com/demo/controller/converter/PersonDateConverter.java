package com.demo.controller.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

/**
 * 日期轉換器。
 * 
 * @author Hopen
 *
 */
public class PersonDateConverter implements Converter<String, Date> {

	@Override
	public Date convert(String source) {
		// 實現 將 日期字符串 轉成 日期類型（格式係yyyy-MM-dd HH:mm:ss）

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		try {
			return simpleDateFormat.parse(source);
		} catch (java.text.ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// 若果參數綁定失敗，返回null。
		return null;

	}

}