package com.himalaya.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.himalaya.service.HimalayaRedisService;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年7月26日 上午9:13:16 Description
 */
@Service
public class HimalayaRedisServiceImpl implements HimalayaRedisService {

	private static final Logger LOGGER = LoggerFactory.getLogger(HimalayaRedisServiceImpl.class);
	
	@Override
	public int service(String param) {
		return 0;
	}
}
