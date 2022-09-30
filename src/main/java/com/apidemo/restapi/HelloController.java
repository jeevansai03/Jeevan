package com.apidemo.restapi;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HelloController {
	@GetMapping("/hello")
	public String helloworld() {
		return "Hello to Rest API";
	}
}
