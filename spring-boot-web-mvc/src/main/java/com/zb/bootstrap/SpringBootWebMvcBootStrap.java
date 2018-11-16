package com.zb.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootWebMvcBoot 引导类
 *
 * @author zb
 * @date 2018/11/15 15:38
 */
@SpringBootApplication(scanBasePackages = "com.zb")
public class SpringBootWebMvcBootStrap {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebMvcBootStrap.class,args);
	}
}
