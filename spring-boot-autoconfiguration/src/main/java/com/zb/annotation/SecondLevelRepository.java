package com.zb.annotation;

import java.lang.annotation.*;

/**
 * @author zb
 * @date 2018/11/8
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@FirstLevelRepository
public @interface SecondLevelRepository {
	
	String value() default "";
}
