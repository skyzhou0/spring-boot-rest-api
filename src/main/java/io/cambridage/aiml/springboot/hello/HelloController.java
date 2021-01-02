package io.cambridage.aiml.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//make it as a controller - Rest. It then allow use map method to url.
@RestController
public class HelloController {
	
	@RequestMapping("/hello")
	public String sayHi() {
		return "hello Spring Boot";
	}

}
