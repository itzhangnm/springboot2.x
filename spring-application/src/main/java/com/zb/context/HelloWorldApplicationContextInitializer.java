package com.zb.context;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

/**
 * HelloWorld ApplicationContextInitializer
 *
 * @author zb
 * @date 2018/11/12 16:39
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
public class HelloWorldApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext> {
	
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("hello world! :" + applicationContext.getId());
	}
}
