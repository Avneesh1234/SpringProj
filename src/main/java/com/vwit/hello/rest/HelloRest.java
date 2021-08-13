package com.vwit.hello.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRest {
	@GetMapping("/helloaws")
	public String data()
	{
		return "Hello AWS";
	}

}
