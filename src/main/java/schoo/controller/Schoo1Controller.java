package schoo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class Schoo1Controller {
	
	@Autowired
	private HttpSession session;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@PostMapping("input")
	public String input(@RequestParam("message") String message) {
		
		String sessionMessage = (String)session.getAttribute("sessionMessage");
		System.out.println("----------メッセージ（追加前）----------");
		System.out.println(sessionMessage);
		
		sessionMessage = sessionMessage + " " + message;
		session.setAttribute("sessionMessage", sessionMessage);
		
		System.out.println("----------メッセージ（追加前）----------");
		System.out.println(sessionMessage);
		
		return "finish";
	}
}
