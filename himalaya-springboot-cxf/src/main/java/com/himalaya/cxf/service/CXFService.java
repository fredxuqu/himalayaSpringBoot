package com.himalaya.cxf.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.himalaya.cxf.dto.FooDTO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年7月4日 上午11:46:41
* Description
*/
//如果不添加的话,动态调用invoke的时候,会报找不到接口内的方法,具体原因未知.
@WebService(targetNamespace="http://cxf.demo.himalaya.com")  
public interface CXFService {

	@WebMethod
	public void add(@WebParam(name = "foo")FooDTO dto);
	
	@WebMethod
	@WebResult(name="String",targetNamespace="")
	public String queryFooName(@WebParam(name = "fooId")String fooId);
}
