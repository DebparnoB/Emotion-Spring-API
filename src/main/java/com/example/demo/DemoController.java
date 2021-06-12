package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/")
public class DemoController {
	
	
	@RequestMapping("/")
	public String appM() {
		
		return " Heroku App works!!" ;
	}		
	
	@RequestMapping("/springEmoApi")
	public String springEmoApi(@RequestParam("text") String text) {
		RestTemplate restTemplate = new RestTemplate();
		String res = restTemplate.getForObject("http://ec2-18-191-175-12.us-east-2.compute.amazonaws.com/process/"+text, String.class);
		return res ;
	}

}
