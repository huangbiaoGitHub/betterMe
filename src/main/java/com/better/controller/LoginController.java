package com.better.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class LoginController {

	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/login");
		return mav;
	}
	
	@RequestMapping("/loginLogic")
	@ResponseBody
	public Object loginLogic(HttpServletRequest request, String account, String password) {
		HashMap<String, Object> backMap = new HashMap<String, Object>();
		backMap.put("msg", "succesee");
		backMap.put("ret", 0);
		backMap.put("url", "http://www.baidu.com");
		
		return backMap;
	}
}
