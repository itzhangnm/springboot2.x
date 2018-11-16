package com.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Hello World {@link Controller}
 *
 * @author zb
 * @date 2018/11/13 15:32
 */
@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	public String index(@RequestParam Integer id){
		System.out.println("helloWorld index!" + id);
		return "index";
	}
}
