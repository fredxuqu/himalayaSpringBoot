package com.himalaya.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2018年7月12日 下午8:08:38 Description
 * 
 * 如果需要跳转到前端页面，需要使用springMVC方式，所以此处只能使用Controller注解，不能使用RestController
 */
@Controller
public class HimalayaController {

	@RequestMapping("/")
	public String index(Map<String, Object> map) {
		map.put("message", "www.jianshu.com");
		return "welcome";
	}
}