package com.zb.bootstrap;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zb
 * @date 2018/11/8
 */
@EnableAutoConfiguration
public class EnableAutoConfigurationBootStrap {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableAutoConfigurationBootStrap.class)
				.web(WebApplicationType.NONE)
				.run(args);
		String helloWorld = context.getBean("helloWorld", String.class);
		System.out.println(helloWorld);
		context.close();
	}
}
