package com.himalaya.controller;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.context.WebApplicationContext;

import com.himalaya.BaseTestCase;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月12日 下午5:00:20
* Description
*/
public class RestControllerTest extends BaseTestCase{

	private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@Before
	public void setUp(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	@Test
	public void testSignPost() throws Exception{
 
        //参数正确
        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap();
 
        paramMap.add("flag","flag1");
        paramMap.add("status","s");
 
        RequestBuilder request = MockMvcRequestBuilders.post("/post").
        param("page","1").param("pageSize","10").params(paramMap);
 
 
        MvcResult mvcResult = mockMvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
	}
}
