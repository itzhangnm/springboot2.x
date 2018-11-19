package com.zb.listener;

import org.springframework.boot.context.config.ConfigFileApplicationListener;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.SmartApplicationListener;
import org.springframework.core.annotation.Order;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * Before {@link ConfigFileApplicationListener}
 *
 * @author zb
 * @date 2018/11/13 11:03
 * //order排序在ConfigFileApplicationListener之前加载
 */
@Order(ConfigFileApplicationListener.DEFAULT_ORDER + 1)
public class BeforeConfigFileApplicationListener implements SmartApplicationListener {
	
	@Override
	public boolean supportsEventType(Class<? extends ApplicationEvent> eventType) {
		return ApplicationEnvironmentPreparedEvent.class.isAssignableFrom(eventType)
				|| ApplicationPreparedEvent.class.isAssignableFrom(eventType);
	}
	
	@Override
	public boolean supportsSourceType(Class<?> aClass) {
		return true;
	}
	
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if (event instanceof ApplicationEnvironmentPreparedEvent) {
			//是现在ConfigFileApplicationListener之前获取配置文件,看是否能获取到
			ConfigurableEnvironment environment = ((ApplicationEnvironmentPreparedEvent) event).getEnvironment();
			System.out.println("environment.getProperty(\"name\"): " + environment.getProperty("name"));
		}
		if (event instanceof ApplicationPreparedEvent) {
		}
	}
	
}
