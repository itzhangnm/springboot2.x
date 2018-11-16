package com.zb;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * spring {@link ConfigurableApplicationContext} 事件 应用上下文引导
 *
 * @author zb
 * @date 2018/11/13 10:39
 */
public class SpringApplicationEventBootstrap {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.addApplicationListener(event -> System.out.println("监听事件: " + event));
		context.refresh();
		context.publishEvent("helloWorld!");
		context.publishEvent("2018!");
		context.publishEvent(new ApplicationEvent("张博!") {
		});
		context.close();
	}
}
