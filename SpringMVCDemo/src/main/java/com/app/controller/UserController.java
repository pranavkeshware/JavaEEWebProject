package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/")
	public String ShowPage()
	{
		return "user-form";
	} 
	
//	@RequestMapping("/show")
//	public String displayPage(HttpServletRequest request,Model model)
//	{
//		String name = request.getParameter("txtUsername");
//		
//		name= name.toUpperCase();
//		String message = "hey "+name;
//		model.addAttribute("msg",message);
//		return "display-user";
//	}
	
	@RequestMapping("/show")
	public String displayPage2(@RequestParam("txtUsername") String theName,Model model)
	{
		
		theName= theName.toUpperCase();
		String message = "Java Trainer "+theName;
		model.addAttribute("msg",message);
		return "display-user";
	}
}
