package com.zb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * ExceptionController
 *
 * @author zb
 * @date 2018/11/15 15:13
 */
@Controller
public class ExceptionController {
	
	@GetMapping("/exception")
	public String exception() {
		int i = 1 / 0;
		return "index";
	}
}
