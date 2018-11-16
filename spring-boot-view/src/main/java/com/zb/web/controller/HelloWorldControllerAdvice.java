package com.zb.web.controller;

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
	
	@ModelAttribute("JSESSIONID")
	public String JSESSIONID(@CookieValue("JSESSIONID")String JSESSIONID){
		return JSESSIONID;
	}
	
	@ExceptionHandler(value = Exception.class)
	public ResponseEntity<String> onException(Exception exception){
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
	}
	
	
}
