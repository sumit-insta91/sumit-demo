package xyz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myRest")
public class MyRestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "Hello World";
	}
}
