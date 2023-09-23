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
	
	/*
	 * トップページのリクエスト
	 * @return input.htmlのパス
	 */
	
	@GetMaping("/")
	public String request() {
		return "input";
	}
	
	@PostMapping("input")
	public String input(@RequestParam("message") String message) {
		String sessionMessage = (String)session.getAttribute("sessionMessage");
		System.out.println("----- メッセージ（追加前） -----");
		System.out.println(sessionMessage);
		
		
		sessionMessage = sessionMessage + " " + message;
		session.setAttribute("sessionMessage", sessionMessage);
		
		System.out.println("----- メッセージ（追加後）-----");
		System.out.println(sessionMessage);
		
		return "finish";
	}
	

}
