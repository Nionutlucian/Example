package com.star.myApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleRestController {

	
	@RequestMapping("/print")
	public String print(@RequestParam(value="name")String name) {
		return name;
	}
	
}
