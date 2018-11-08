package com.zb.bootstrap;

import com.zb.service.CalculateService;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author zb
 * @date 2018/11/8
 */
@SpringBootApplication(scanBasePackages = "com.zb.service")
public class CalculateServiceBootStrap {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(CalculateServiceBootStrap.class)
				.web(WebApplicationType.NONE)
				.profiles("java8")
				.run(args);
		CalculateService calculateService = context.getBean(CalculateService.class);
		calculateService.sum(1,2,3,4,5,6,7,8,9,10);
		context.close();
	}
}
