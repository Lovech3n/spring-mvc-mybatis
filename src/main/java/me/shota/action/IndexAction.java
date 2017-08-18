package me.shota.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import me.shota.bean.User;
import me.shota.service.UserService;

@Controller
@RequestMapping(value="")
public class IndexAction {
	@Resource
	private UserService userService;
	
	@RequestMapping("")
	public String index1(){
		return "redirect:/index";
	}
	
	@RequestMapping(value = "index")
	public String index(){
		
		List<User> list = userService.getAllUserList(null);
		System.out.println(list.size());
		return "index";
	}
}
