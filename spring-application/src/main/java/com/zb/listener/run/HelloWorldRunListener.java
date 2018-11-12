package com.zb.listener.run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * HelloWorld 运行监听 {@link SpringApplicationRunListener}
 *
 * @author zb
 * @date 2018/11/12 18:38
 */
public class HelloWorldRunListener implements SpringApplicationRunListener, Ordered {
	
	/**
	 * RunListener实现此构造函数
	 * @param application
	 * @param args
	 */
	public HelloWorldRunListener(SpringApplication application, String[] args) {
	}
	
	@Override
	public void starting() {
		System.out.println("HelloWorldRunListener.starting()...");
	}
	
	
	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
	
	}
	
	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
	
	}
	
	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
	
	}
	
	@Override
	public void started(ConfigurableApplicationContext context) {
	
	}
	
	@Override
	public void running(ConfigurableApplicationContext context) {
	
	}
	
	@Override
	public void failed(ConfigurableApplicationContext context, Throwable exception) {
	
	}
	
	@Override
	public int getOrder() {
		return 1;
	}
}
