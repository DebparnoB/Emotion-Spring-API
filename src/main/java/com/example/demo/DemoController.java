package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/api")
public class DemoController {
	
	
	
	@RequestMapping("/hello")
	public String hello() {
		RestTemplate restTemplate = new RestTemplate();
		String res = restTemplate.getForObject("http://ec2-18-191-175-12.us-east-2.compute.amazonaws.com/", String.class);
		return res ;
	}

}
