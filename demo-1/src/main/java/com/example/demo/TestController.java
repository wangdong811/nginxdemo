package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/test")
public class TestController  {
	
	
	@RequestMapping(value="info")
	public  String getInfo() {
	System.out.println("server1");
	return "现在调用的是server1";	
		
	}
	
	

}
