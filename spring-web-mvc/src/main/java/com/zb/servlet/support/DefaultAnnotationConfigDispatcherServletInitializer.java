package com.zb.servlet.support;

import com.zb.config.DefaultDispatchServletConfiguration;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 默认servlet自动装配器
 *
 * @author zb
 * @date 2018/11/15 15:26
 */
public class DefaultAnnotationConfigDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{DefaultDispatchServletConfiguration.class};
	}
	
	@Override
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
