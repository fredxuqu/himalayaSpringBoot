package com.himalaya.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年7月12日 下午8:08:38 Description
 * 
 * RestFul style API, Annotation should be RestController
 */
@RestController
public class HimalayaBaseController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaBaseController.class);
	
	@RequestMapping(value="/index", method={RequestMethod.GET}, produces={"application/json; charset=UTF-8","text/html;charset=utf-8"})
	public String index() {
		return "index";
	}
}