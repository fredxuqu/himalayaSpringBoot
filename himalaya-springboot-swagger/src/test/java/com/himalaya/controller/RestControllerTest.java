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

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*; 
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*; 

import com.himalaya.BaseTestCase;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月12日 下午5:00:20
* Description
*/
public class RestControllerTest extends BaseTestCase {

private MockMvc mockMvc;
	
	@Autowired
	private WebApplicationContext context;
	
	@Before
	public void setUp(){
		this.mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}
	
	@Test
	public void testGet() throws Exception{
 
		MvcResult result = mockMvc.perform(
        		get("/getByParamId")
        		.param("id","1")
        		.contentType("application/json; charset=UTF-8")) 
        .andExpect(status().isOk()).andReturn(); 
        System.out.println(result.getResponse().getContentAsString());
	}
	
	@Test
	public void testPost() throws Exception{
 
        MvcResult result = mockMvc.perform(
        		post("/getByBody")
        		.content("{\"id\":\"1\",\"name\":\"fred\"}")
        		.contentType("application/json; charset=UTF-8")) 
        .andExpect(status().isOk()).andReturn(); 
        System.out.println(result.getResponse().getContentAsString());
	}
	
	@Test
	public void testSignPost() throws Exception{
 
        //参数正确
        MultiValueMap<String, String> paramMap = new LinkedMultiValueMap();
 
        paramMap.add("id","1");
        paramMap.add("name","s");
 
        RequestBuilder request = MockMvcRequestBuilders.post("/getByBody").params(paramMap)
        		.contentType("application/json; charset=UTF-8");
  
        MvcResult mvcResult = mockMvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
	}
	
	@Test
	public void testSignPost1() throws Exception{
 
        RequestBuilder request = MockMvcRequestBuilders.post("/getByBody").content("{\"id\":\"1\",\"name\":\"fred\"}")
        		.contentType("application/json; charset=UTF-8");
  
        MvcResult mvcResult = mockMvc.perform(request)
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        System.out.println("----------- " + mvcResult.getResponse().getContentAsString());
	}
}
