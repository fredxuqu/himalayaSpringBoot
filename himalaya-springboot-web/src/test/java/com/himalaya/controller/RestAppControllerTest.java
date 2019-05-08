package com.himalaya.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月12日 下午5:00:20
* Description
*/
public class RestAppControllerTest {

	@Test
	public void testSignPost(){
		
		// prepare http request
        String requestURL = "http://127.0.0.1:8081/post";
		HttpPost httpRequst = new HttpPost(requestURL);
		
		// set data
		StringBuffer data = new StringBuffer("{");
		data.append("\"flag\":\"10100101\",");
		data.append("\"status\":\"active\""); 
		data.append("}");
		System.out.println(data.toString());
		StringEntity stringentity = new StringEntity(data.toString(),
                ContentType.create("application/json", "utf-8"));
		httpRequst.setEntity(stringentity);
		
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串
			System.out.println("[Thirdpart CallAPIDemo][result] " + result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[Thirdpart Order][result] " + e);
		} 
	}
	
	@Test
	public void testSignPost1(){
		
		// prepare http request
        String requestURL = "http://127.0.0.1:8081/post1/3?foo=fred";
		HttpPost httpRequst = new HttpPost(requestURL);
		
		// set data
		StringBuffer data = new StringBuffer("{");
		data.append("\"flag\":\"10100101\",");
		data.append("\"status\":\"active\""); 
		data.append("}");
		System.out.println(data.toString());
		StringEntity stringentity = new StringEntity(data.toString(),
                ContentType.create("application/json", "utf-8"));
		httpRequst.setEntity(stringentity);
		
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串
			System.out.println("[Thirdpart CallAPIDemo][result] " + result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[Thirdpart Order][result] " + e);
		} 
	}
	
	@Test
	public void testSignPost2(){
		
		// prepare http request
        String requestURL = "http://127.0.0.1:8081/post2?flag=10100101&status=active";
		HttpPost httpRequst = new HttpPost(requestURL);
		
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串
			System.out.println("[Thirdpart CallAPIDemo][result] " + result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[Thirdpart Order][result] " + e);
		} 
	}
	
	@Test
	public void testSignGet(){
		
		// prepare http request
        String requestURL = "http://127.0.0.1:8081/get?flag=10100101&status=active";
		HttpGet httpRequst = new HttpGet(requestURL);
		
		try {
			CloseableHttpClient httpclient = HttpClients.createDefault();
			CloseableHttpResponse httpResponse = httpclient.execute(httpRequst);
			System.out.println(httpResponse.getStatusLine().getStatusCode());
			HttpEntity httpEntity = httpResponse.getEntity();
			String result = EntityUtils.toString(httpEntity);// 取出应答字符串
			System.out.println("[Thirdpart CallAPIDemo][result] " + result);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[Thirdpart Order][result] " + e);
		} 
	}
}
