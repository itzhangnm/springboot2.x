package com.zb;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * spring 应用上下文引导
 *
 * @author zb
 * @date 2018/11/13 10:57
 */
@SpringBootApplication
public class SpringApplicationContextBootstrap {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(SpringApplicationContextBootstrap.class)
				.web(WebApplicationType.NONE)
				.run(args);
		//根据WebApplicationType会生成不同的context和environment
		System.out.println(context.getClass().getName());
		System.out.println(context.getEnvironment().getClass().getName());
		context.close();
	}
}
