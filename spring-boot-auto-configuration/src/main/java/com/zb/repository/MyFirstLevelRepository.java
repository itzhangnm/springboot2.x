package com.zb.repository;

import com.zb.annotation.FirstLevelRepository;
import com.zb.annotation.SecondLevelRepository;

/**
 * @author zb
 * @date 2018/11/8
 */
/*@FirstLevelRepository(value = "myFirstLevelRepository")*/
@SecondLevelRepository(value = "mySecondLevelRepository")
public class MyFirstLevelRepository {
}
