package com.himalaya.service.impl;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

import com.himalaya.service.BeanInterface;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年9月1日 下午5:18:21
* Description
*/
//@Order(2)
@Service
public class BeanInterfaceImplTwo implements BeanInterface {

	@Override
	public void service() {
		
		System.out.println("BeanInterfaceImplTwo");
	}
}
