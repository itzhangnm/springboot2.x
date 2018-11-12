package com.zb.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author zb
 * @date 2018/11/8
 */
@Profile("java7")
@Service
public class CalculateService7Impl implements CalculateService {
	@Override
	public Integer sum(Integer... values) {
		System.out.println("java7方式求和");
		int sum = 0;
		for (Integer value : values) {
			sum += value;
		}
		return sum;
	}
}
