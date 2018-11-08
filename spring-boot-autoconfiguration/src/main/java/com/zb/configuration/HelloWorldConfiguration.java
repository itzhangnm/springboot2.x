package com.zb.configuration;

import org.springframework.context.annotation.Bean;

/**
 * @author zb
 * @date 2018/11/8
 */
public class HelloWorldConfiguration {
	
	@Bean
	public String helloWorld(){
		return "Hello,World 2018!";
	}
}
