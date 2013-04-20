package com.sujay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

  @RequestMapping("/helloWorld")
	public String helloWorld(Model model) {
		model.addAttribute("msg", "Hello World!");
		return "helloWorld";
	}
	
//	@RequestMapping("/simple")
//	public @ResponseBody String simple() {
//		return "Hello world!";
//	}
//
//	@RequestMapping(value="/simple/revisited", method=RequestMethod.GET, headers="Accept=text/plain")
//	public @ResponseBody String simpleRevisited() {
//		return "Hello world revisited!";
//	}

}
