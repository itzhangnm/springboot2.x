package com.zb;

import com.bean.ApplicationAnnotationTestBean;
import com.bean.ApplicationXmlTestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * SpringApplication 上下文引导类
 *
 * @author zb
 * @date 2018/11/12 15:33
 */

//@SpringBootApplication spring boot上下文引导不需要当前类,任何一个 或多个都行
public class SpringApplicationBootstrap {
	
	public static void main(String[] args) {
		Set<String> sourcesSet = new HashSet<>();
		//添加class sources
		sourcesSet.add(SpringApplicationBootstrap.class.getName());
		//添加package路径sources
		sourcesSet.add("com.bean");
		//添加xml配置sources
		sourcesSet.add("classpath:/application-bean.xml");
		//sourcesSet.add(ApplicationConfiguration.class.getName()) 已注册无法重新注册;
		SpringApplication application = new SpringApplication(ApplicationConfiguration.class);
		//改变当前上下文推导的web类型
		application.setWebApplicationType(WebApplicationType.NONE);
		application.setSources(sourcesSet);
		//application.addPrimarySources();
		ConfigurableApplicationContext context = application.run(args);
		
		ApplicationConfiguration applicationConfiguration = context.getBean(ApplicationConfiguration.class);
		System.out.println(applicationConfiguration);
		
		ApplicationAnnotationTestBean annotationTestBean = context.getBean(ApplicationAnnotationTestBean.class);
		System.out.println(annotationTestBean);
		
		ApplicationXmlTestBean applicationXmlTestBean = context.getBean("applicationXmlTestBean", ApplicationXmlTestBean.class);
		System.out.println(applicationXmlTestBean);
		
		context.close();
	}
	
	@SpringBootApplication
	public static class ApplicationConfiguration {
	
	}
}
