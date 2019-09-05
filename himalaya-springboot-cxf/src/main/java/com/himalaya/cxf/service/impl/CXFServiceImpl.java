package com.himalaya.cxf.service.impl;

import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.himalaya.cxf.dto.FooDTO;
import com.himalaya.cxf.service.CXFService;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年7月4日 上午11:47:55
* Description
*/
@WebService(serviceName="CXFService", //对外发布的服务名
            targetNamespace="http://cxf.demo.himalaya.com", //指定你想要的名称空间，通常使用使用包名反转
            endpointInterface="com.himalaya.cxf.service.CXFService") //服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Component
public class CXFServiceImpl implements CXFService {

	@Override
	public void add(FooDTO dto) {
		System.out.println(dto.getFooId() + " " + dto.getFooName());
	}

	@Override
	public String queryFooName(String fooId) {
		System.out.println(fooId);
		return "fooName ".concat(fooId);
	}
}
