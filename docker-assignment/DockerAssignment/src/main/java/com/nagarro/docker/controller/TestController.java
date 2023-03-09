package com.nagarro.docker.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/test")
	public Map<String,Object> get(){
		Map<String,Object> data=new HashMap<>();
		data.put("message", "api is running");
		data.put("names", Arrays.asList("shivam","aman","priyank"));
		data.put("code","201");
		return data;
	}

}
