package com.zb.annotation;

import com.zb.configuration.HelloWorldConfiguration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zb
 * @date 2018/11/8
 */
public class HelloWorldImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		return new String[]{HelloWorldConfiguration.class.getName()};
	}
}
