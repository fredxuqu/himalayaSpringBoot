package com.himalaya.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年7月12日 下午8:08:38 Description
 */
@RestController
public class HimalayaRestController {

	@RequestMapping("/index")
	public String index() {
		return "Server is running..."; 
	}
}