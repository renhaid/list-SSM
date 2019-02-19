package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestHello {

	public static final String SUCCESS="success";	
	
	@RequestMapping("/hello")
	@ResponseBody
	public String test(){
		
		return SUCCESS;
	}
}
