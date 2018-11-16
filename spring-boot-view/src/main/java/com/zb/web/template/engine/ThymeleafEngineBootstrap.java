package com.zb.web.template.engine;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring5.ISpringTemplateEngine;
import org.thymeleaf.spring5.SpringTemplateEngine;
import sun.nio.ch.IOUtil;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Thymeleaf 上下文引导
 *
 * @author zb
 * @date 2018/11/16 15:32
 */
public class ThymeleafEngineBootstrap {
	
	public static void main(String[] args) throws IOException {
		//构建引擎
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		//构建渲染上下文
		Context context = new Context();
		//设置参数
		context.setVariable("message","helloWorld!");
		//文件读取
		ResourceLoader resourceLoader = new DefaultResourceLoader();
		Resource resource = resourceLoader.getResource("classpath:/template/thymeleaf/hello.html");
		FileInputStream inputStream = new FileInputStream(resource.getFile());
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		IOUtils.copy(inputStream,outputStream);
		//String result = templateEngine.process("<p th:text=\"${message}\">!!!</p>", context);
		String content = outputStream.toString("utf-8");
		//渲染
		String result = templateEngine.process(content, context);
		System.out.println(result);
		
		
	}
}
