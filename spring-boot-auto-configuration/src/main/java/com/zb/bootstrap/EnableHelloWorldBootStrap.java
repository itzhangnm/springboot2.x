package com.zb.bootstrap;

import com.zb.annotation.EnableHelloWold;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * @author zb
 * @date 2018/11/8
 */
@EnableHelloWold
public class EnableHelloWorldBootStrap {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(EnableHelloWorldBootStrap.class)
				.web(WebApplicationType.NONE)
				.run(args);
		String world = context.getBean("helloWorld", String.class);
		System.out.println(world);
		context.close();
	}
}
