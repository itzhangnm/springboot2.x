package com.zb.web.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot View 引导类
 *
 * @author zb
 * @date 2018/11/16 15:49
 */
@SpringBootApplication(scanBasePackages = "com.zb.web")
public class SpringBootViewBootstrap {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootViewBootstrap.class,args);
	}
}
