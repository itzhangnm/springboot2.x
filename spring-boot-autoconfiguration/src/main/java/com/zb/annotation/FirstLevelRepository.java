package com.zb.annotation;

import org.springframework.stereotype.Repository;

import java.lang.annotation.*;

/**
 * @author zb
 * @date 2018/11/8
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Repository
public @interface FirstLevelRepository {
	
	String value() default "";
}
