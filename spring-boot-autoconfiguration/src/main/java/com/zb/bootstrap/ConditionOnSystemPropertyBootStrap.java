package com.zb.bootstrap;

import com.zb.condition.ConditionOnSystemProperty;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author zb
 * @date 2018/11/8
 */
public class ConditionOnSystemPropertyBootStrap {
	
	@Bean
	@ConditionOnSystemProperty(name = "user.name",value = "zb")
	public String helloWorld(){
		return "hello world zb!";
	}
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(ConditionOnSystemPropertyBootStrap.class)
				.web(WebApplicationType.NONE)
				.run(args);
		String helloWorld = context.getBean("helloWorld", String.class);
		System.out.println(helloWorld);
		context.close();
		
	}
}
