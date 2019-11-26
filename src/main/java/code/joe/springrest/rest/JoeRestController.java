package code.joe.springrest.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// this class is our rest controller
@RestController
@RequestMapping("/testconn")
public class JoeRestController {

	
	// adding for testing the connection
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello!! It's working!";
	}
	
}
