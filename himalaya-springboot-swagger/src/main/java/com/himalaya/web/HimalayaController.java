package com.himalaya.web;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.himalaya.dto.UserDTO;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年7月12日 下午8:08:38 Description
 * 
 * 如果需要跳转到前端页面，需要使用springMVC方式，所以此处只能使用Controller注解，不能使用RestController
 */
@RestController
public class HimalayaController {
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaController.class);
		
	@RequestMapping(value="/get/{id}", 
					method={RequestMethod.GET,RequestMethod.POST},
					produces={"application/json; charset=UTF-8","text/html;charset=utf-8"})
	public String getById(@PathVariable("id") String id) {
		
		LOGGER.info("Path variable : " + id);
		Map<String, String> user = new HashMap<String, String>();
		user.put("id", "1");
		user.put("name", "fred");
		return JSON.toJSONString(user);
	}
	
	@RequestMapping(value="/getByMap", 
					method={RequestMethod.GET,RequestMethod.POST},
					consumes={"application/json; charset=UTF-8"},
					produces={"application/json; charset=UTF-8"})
	public String getByMap(@RequestParam Map<String, String> param) {
		
		LOGGER.info("Request params map : " + JSON.toJSONString(param));
		
		Map<String, String> user = new HashMap<String, String>();
		user.put("id", "1");
		user.put("name", "fred");
		return JSON.toJSONString(user);
	}
	
	@RequestMapping(value="/getByParamId", 
					method={RequestMethod.GET,RequestMethod.POST},
					produces={"application/json; charset=UTF-8"})
	public String getByParamId(@RequestParam("id") String id) {
		
		LOGGER.info("Request params : " + id);
		
		Map<String, String> user = new HashMap<String, String>();
		user.put("id", "1");
		user.put("name", "fred");
		return JSON.toJSONString(user);
	}
	
	@RequestMapping(value="/getByBody", 
					method={RequestMethod.GET,RequestMethod.POST},
					consumes={"application/json; charset=UTF-8"},
					produces={"application/json; charset=UTF-8"})
	public String getByRequestBody(@RequestBody(required=false) UserDTO userDTO) {
		
		LOGGER.info("Request Body : " + JSON.toJSONString(userDTO));
		
		Map<String, String> user = new HashMap<String, String>();
		user.put("id", "1");
		user.put("name", "fred");
		return JSON.toJSONString(user);
	}
}