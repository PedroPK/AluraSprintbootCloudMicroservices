package microloja.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FirstController {
	
	@RequestMapping("/")
	@ResponseBody
	public String welcomeMessage() {
		return "Bem-vindo à nossa Loja de Flores de Goiás";
	}
	
}
