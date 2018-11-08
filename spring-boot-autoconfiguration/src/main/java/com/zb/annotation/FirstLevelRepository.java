package com.zb.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author zb
 * @date 2018/11/8
 */
@Repository
public @interface FitstLevelRepository {
	
	String value() default "";
}
