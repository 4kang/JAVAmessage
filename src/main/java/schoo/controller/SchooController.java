package schoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //このファイル(class)がControllerだと目印つける
public class SchooController {
	
	//アノテーション
	@GetMapping("/") // http://localhost:8080/
	//Stringの文字列を返却するメソッド
	public String index() {
		return "index"; //index文字列を返却
	}
	
	@PostMapping("login") // http://localhost:8080/login
	//loginのリクエストを受け付けるメソッド
	public String login(@RequestParam("loginId")String loginId,
			            @RequestParam("loginPassword")String loginPassword) {
		//変数 = loginID,password
		
		//初期Id,初期Passwordを引数に設定
		if("schoo".equals(loginId) && "pass".equals(loginPassword)) {
			//ログイン成功
			return "login-ok"; //htmlのファイル名を指定
		}else {
			//ログイン失敗
			return "login-ng";
			
		}
		
	}

}
