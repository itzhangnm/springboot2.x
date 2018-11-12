package com.zb.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.Ordered;

/**
 * HelloWorld 监听 {@link ApplicationContext} 的事件 {@link ContextRefreshedEvent}
 *
 * @author zb
 * @date 2018/11/12 17:32
 */
public class HelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent>,Ordered {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("HelloWorld.id:" + event.getApplicationContext().getId() + ",timestamp:" + event.getTimestamp());
	}
	
	@Override
	public int getOrder() {
		return Ordered.HIGHEST_PRECEDENCE;
	}
}
