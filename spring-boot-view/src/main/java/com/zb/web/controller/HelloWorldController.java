package com.zb.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * helloWorld controller
 *
 * @author zb
 * @date 2018/11/16 15:46
 */
@Controller
public class HelloWorldController {
	
	@GetMapping(value = "/hello")
	public String helloWorld(Model model) {
		model.addAttribute("message", "helloWorld!");
		return "hello";
	}
	
	@GetMapping(value = "/index")
	public String index(){
		return "index";
	}
}
