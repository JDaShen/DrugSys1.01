package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	/*@Autowired
	private UserService userService;*/
	
	@RequestMapping("/showTree")
	public void showTree() {
		
	}
}
