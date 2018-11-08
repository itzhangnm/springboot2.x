package com.zb.condition;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author zb
 * @date 2018/11/8
 */
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(OnSystemPropertyCondition.class)
public @interface ConditionSystemProperty {
	
	/**
	 * 系统属性名称
	 * @return
	 */
	String name();
	
	/**
	 * 系统属性值
	 * @return
	 */
	String value();
}
