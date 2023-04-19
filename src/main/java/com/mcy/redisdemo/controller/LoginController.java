package com.mcy.redisdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping(value = "/login")
	public String loginTest() {
		return "login";
	}
	
	@RequestMapping(value = "greeting")
	public ModelAndView test(ModelAndView mv) {
	    mv.setViewName("greeting");
	    mv.addObject("title","欢迎使用Thymeleaf!");
	    return mv;
	}
}
