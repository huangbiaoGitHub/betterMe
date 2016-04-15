package com.better.controller;

import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.better.service.UserService;
import com.better.util.WebUtil;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService; 
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/user/login");
		return mav;
	}
	
	@RequestMapping("/loginLogic")
	@ResponseBody
	public Object loginLogic(HttpServletRequest request, String account, String password) {
		HashMap<String, Object> backMap = new HashMap<String, Object>();
		
		this.userService.login();
		WebUtil.setSession(request, "account", account);
		
		backMap.put("msg", "succesee");
		backMap.put("ret", 0);
		backMap.put("url", "better/list");
		
		return backMap;
	}
}
