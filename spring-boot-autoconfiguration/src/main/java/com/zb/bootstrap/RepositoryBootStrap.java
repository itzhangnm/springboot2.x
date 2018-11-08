package com.zb.bootstrap;

import com.zb.repository.MyFirstLevelRepository;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author zb
 * @date 2018/11/8
 */
@ComponentScan(basePackages = "com.zb.repository")
public class RepositoryBootStrap {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new SpringApplicationBuilder(RepositoryBootStrap.class)
				.web(WebApplicationType.NONE)
				.run(args);
		MyFirstLevelRepository myFirstRepository = context.getBean("mySecondLevelRepository", MyFirstLevelRepository.class);
		System.out.println(myFirstRepository);
		System.out.println("ccc");
		context.close();
	}
}
