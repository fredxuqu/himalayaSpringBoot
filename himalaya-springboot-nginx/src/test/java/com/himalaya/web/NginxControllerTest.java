package com.himalaya.web;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.himalaya.BaseTestCase;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年10月17日 下午3:12:49 Description
 */
public class NginxControllerTest extends BaseTestCase {

	MockMvc mvc;

	@Autowired
	WebApplicationContext webApplicationConnect;

	@Before
	public void setUp() throws JsonProcessingException {
		mvc = MockMvcBuilders.webAppContextSetup(webApplicationConnect).build();
	}

	@Test
	public void testShow() throws Exception {
		String expectedResult = "fred";
		String uri = "/admin/test?userName=fred";
		MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON))
				.andReturn();
		int status = mvcResult.getResponse().getStatus();
		String content = mvcResult.getResponse().getContentAsString();
		
		LOGGER.info("Response content : " + content);
		Assert.assertTrue("错误，正确的返回值为200", status == 200);
		Assert.assertFalse("错误，正确的返回值为200", status != 200);
		Assert.assertTrue("数据一致", expectedResult.equals(content));
		Assert.assertFalse("数据不一致", !expectedResult.equals(content));
	}
}