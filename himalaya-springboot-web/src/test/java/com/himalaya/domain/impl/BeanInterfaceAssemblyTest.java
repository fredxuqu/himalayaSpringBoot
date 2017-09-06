package com.himalaya.domain.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.BaseTestCase;
import com.himalaya.service.BeanInterface;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年9月1日 下午5:23:21
* Description
*/
public class BeanInterfaceAssemblyTest extends BaseTestCase {

	@Autowired
	List<BeanInterface> list;
	
	@Autowired
	Map<String, BeanInterface> map;
	
	@Test
	public void testAssemblyBean(){
		
		for (BeanInterface beanInterface : list) {
			
			beanInterface.service(); 
		}
		
		for (Entry<String, BeanInterface> entry : map.entrySet()) {
			System.out.println(entry.getKey());
			entry.getValue().service();
		}
	}
}
