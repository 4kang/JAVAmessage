package schoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class SchooController {
	
	@Autowired
	private HttpSession session;
	
	@GetMaping("/")
	public String request() {
		return "input";
	}
	
	@PostMapping("input")
	public String input(@RequestParam("message") String message) {
		
		
	}
	

}
