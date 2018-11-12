package com.zb.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.stream.Stream;

/**
 * @author zb
 * @date 2018/11/8
 */
@Service
@Profile("java8")
public class CalculateService8Impl implements CalculateService {
	
	@Override
	public Integer sum(Integer... values) {
		System.out.println("java8方式求和");
		return Stream.of(values).reduce(0,Integer::sum);
	}
}
