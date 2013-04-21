package com.sujay.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value = "/helloWorld", method = RequestMethod.GET)
	public String helloWorld(Model model) {
		model.addAttribute("msg", "Hello World!");
		Date today = new Date();
		model.addAttribute("today", today);
		return "helloWorld";
	}

	@RequestMapping(value = "/content", method = RequestMethod.GET)
	public ModelAndView getContent() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("helloWorld");
		mav.addObject("msg", "Hello World!");
		return mav;
	}

	@RequestMapping("/simple")
	public @ResponseBody
	String simple() {
		return "Hello world!";
	}

	@RequestMapping(value = "/simple/revisited", method = RequestMethod.GET, headers = "Accept=text/plain")
	public @ResponseBody
	String simpleRevisited() {
		return "Hello world revisited!";
	}

}
