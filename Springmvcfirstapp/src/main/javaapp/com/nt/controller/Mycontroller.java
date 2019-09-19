package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Mycontroller 
{
	@GetMapping("/result")
	public ModelAndView mav()
	{
		ModelAndView view= new ModelAndView();
		view.setViewName("index");
		return view;
		
	}

}
