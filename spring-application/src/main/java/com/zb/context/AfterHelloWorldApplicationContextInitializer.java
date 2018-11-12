package com.zb.context;

import org.springframework.boot.context.ContextIdApplicationContextInitializer;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.Ordered;

import static org.springframework.core.Ordered.LOWEST_PRECEDENCE;

/**
 * After HelloWorld ApplicationContextInitializer
 *
 * @author zb
 * @date 2018/11/12 16:42
 */
public class AfterHelloWorldApplicationContextInitializer implements ApplicationContextInitializer<ConfigurableApplicationContext>,Ordered {
	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		System.out.println("after hello world! : " + applicationContext.getId());
	}
	
	/**
	 * 接口方式实现排序
	 * @return
	 */
	@Override
	public int getOrder() {
		return LOWEST_PRECEDENCE - 1;
	}
}
