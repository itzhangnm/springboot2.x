package com.zb.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * {@link HelloWorldController} advice
 *
 * @author zb
 * @date 2018/11/15 14:28
 */
@ControllerAdvice(assignableTypes = HelloWorldController.class)
public class HelloWorldControllerAdvice {

	@ModelAttribute("message")
	public String message(){
		return "helloWorld";
	}
	
	@ModelAttribute("acceptLanguage")
	public String acceptLanguage(@RequestHeader("Accept-Language")String acceptLanguage){
		return acceptLanguage;
	}
	
	@ModelAttribute("jSessionId")
	public String jSessionId(@CookieValue("jSessionId")String jSessionId){
		return jSessionId;
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> onException(Exception exception){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
	}
	
	
}
