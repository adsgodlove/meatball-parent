package com.meatball.test;
/**
 * Project Name:meatball-core
 * File Name:TokenTest.java
 * Package Name:com.meatball.test
 * Date:2018年3月26日下午5:31:56
 * Copyright (c) 2018, zhang.xiangyu@foxmail.com All Rights Reserved.
*/


import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.meatball.MeatballApplication;
import com.meatball.component.TokenComponent;

/**   
 * @Title: TokenTest.java 
 * @Package com.meatball.test 
 * @Description: TODO(用一句话描述该文件做什么) 
 * @author 張翔宇  
 * @date 2018年3月26日 下午5:31:56 
 * @version V1.0   
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = MeatballApplication.class)
public class TokenTest {
	
	@Resource
	private TokenComponent tokenComponent;
	
	@Test
	public void test() {
		String aaa = tokenComponent.createJWT("oMX4Sv2qkUrbv936t6H_Wj0xZ9IU");
		System.out.println(aaa);
	}
}
