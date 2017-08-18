package me.shota.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="")
public class IndexAction {
	
	@RequestMapping("")
	public String index1(){
		return "redirect:/index";
	}
	
	@RequestMapping(value = "index")
	public String index(){
		return "index";
	}
}
