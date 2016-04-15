package com.better.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/better")
public class BetterController {

	@RequestMapping("/list")
	public ModelAndView list(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/better/list");
		
		return mav;
	}
}
