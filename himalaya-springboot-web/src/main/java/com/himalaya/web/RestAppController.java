package com.himalaya.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.himalaya.dto.ParamDTO;

import jnr.ffi.types.int16_t;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月12日 下午4:23:26
* @RequestParam 用于获取request.getParameter("key") 且参数名称必须与 “key” 一致
* @PathVariable("version")，获取uri路径中的变量，比如 /post1/3，则/post1/{version}的version所对应的值为3
* @RequestBody 用于接收request body中的内容，且格式必须是json格式
* 如果参数是Bean，且没有任何的注解，则Spring可以自动将request.getParameter("key"),按照参数和属性一一对应的映射到bean中，
* 	例如public String post2(ParamDTO dto)
* 
*/
@RestController
public class RestAppController {

	@RequestMapping(value = "/get", method = { RequestMethod.GET })
	public String get(@RequestParam("flag") String flag, 
					  @RequestParam("status") String status){
		
		System.out.println("/get : " + flag + " " + status);
		return flag + " " + status;
	}
	
	
	@RequestMapping(value = "/post", method = { RequestMethod.POST, RequestMethod.GET })
	public String post(@RequestBody ParamDTO dto){
		System.out.println("/post : " + dto.getFlag() + " " + dto.getStatus());
		return dto.getFlag() + " " + dto.getStatus();
	}
	
	
	@RequestMapping(value = "/post1/{version}", method = { RequestMethod.POST, RequestMethod.GET })
	public String post(@PathVariable("version") int version, @RequestParam("foo") String foo, @RequestBody(required=false) ParamDTO dto){
		if(dto!=null){
			System.out.println("/post1/" + version + " : " + dto.getFlag() + " " + dto.getStatus() + " " + foo);
			return dto.getFlag() + " " + dto.getStatus() + " " + foo;
		}
		return foo;
	}
	
	
	@RequestMapping(value = "/post2", method = { RequestMethod.POST, RequestMethod.GET })
	public String post2(ParamDTO dto){
		if(dto!=null){
			System.out.println("/post1 : " + dto.getFlag() + " " + dto.getStatus());
			return dto.getFlag() + " " + dto.getStatus();
		}
		return "";
	}
}
