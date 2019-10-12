package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PostMapping;

import com.zensar.entities.User;
import com.zensar.services.UserService;
//Request processor component
@Controller
public class LoginController {
	@Autowired
	private UserService userService;
	@PostMapping("login")
	private String checkLogin(User user, ModelMap map) {
		if (userService.validateUser(user)){
			map.addAttribute("usernm", user.getUsername());
			return "welcome";
		}
		else {
			map.addAttribute("logonerror","Invalid username or password");
			return "login";
		}
	}
}
