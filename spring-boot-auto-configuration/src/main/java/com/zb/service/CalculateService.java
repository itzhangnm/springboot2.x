package com.zb.service;

/**
 *
 * @author zb
 * @date 2018/11/8
 */
public interface CalculateService {
	
	/**
	 * 计算多个整数和
	 * @param values 多个整数
	 * @return 结果之和
	 */
	Integer sum(Integer... values);
}
