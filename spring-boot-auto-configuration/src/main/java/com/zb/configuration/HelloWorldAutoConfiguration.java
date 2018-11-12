package com.zb.configuration;

import com.zb.annotation.EnableHelloWold;
import com.zb.condition.ConditionOnSystemProperty;
import org.springframework.context.annotation.Configuration;

/**
 * @author zb
 * @date 2018/11/8
 */
@Configuration  //模式注解装配
@EnableHelloWold //模块装配装配
@ConditionOnSystemProperty(name = "user.name",value = "zb") //条件装配
public class HelloWorldAutoConfiguration {
}
