package com.zb.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

/**
 *  系统属性条件判断装配
 * @author zb
 * @date 2018/11/8
 */
public class OnSystemPropertyCondition implements Condition {
	@Override
	public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
		
		Map<String, Object> attributes = metadata.getAnnotationAttributes(ConditionOnSystemProperty.class.getName());
		String name = String.valueOf(attributes.get("name"));
		String value = String.valueOf(attributes.get("value"));
		String propertyValue = System.getProperty(name);
		return propertyValue.equals(value);
	}
}
