package com.dxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class Hello_01 {

	@RequestMapping("/hello/{country}/{username}")
	public ModelAndView helloworld(@PathVariable("country") String a,@PathVariable("username") String b){
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		System.out.println(a);
		System.out.println(b);
		modelAndView.addObject("msg", "Hello world");
		return modelAndView;
	}
}
