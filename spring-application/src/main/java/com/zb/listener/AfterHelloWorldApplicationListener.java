package com.zb.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.annotation.Order;

/**
 * After HelloWorld 监听{@link ApplicationContext} 事件{@link ContextRefreshedEvent}
 *
 * @author zb
 * @date 2018/11/12 17:43
 */
@Order
public class AfterHelloWorldApplicationListener implements ApplicationListener<ContextRefreshedEvent> {
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("After HelloWorld.id: " + event.getApplicationContext().getId() + ", timestamp:" + event.getTimestamp());
	}
}
