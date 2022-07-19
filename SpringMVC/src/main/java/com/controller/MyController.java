package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	@RequestMapping(value= "hello" , method = RequestMethod.GET)
	public ModelAndView sayHello() {
		System.out.println("I came here");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("display.jsp");
		return mav;
	}
	@RequestMapping(value = "checkUser" , method= RequestMethod.POST)
	public ModelAndView ckeckUserDetails(HttpServletRequest req) {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		ModelAndView mav = new ModelAndView();
		if(email.equals("raj@gmail.com") && password.endsWith("123")) {
				mav.setViewName("success.jsp");
		}else {
				mav.setViewName("failure.jsp");
		}
		return mav;
	}
}
