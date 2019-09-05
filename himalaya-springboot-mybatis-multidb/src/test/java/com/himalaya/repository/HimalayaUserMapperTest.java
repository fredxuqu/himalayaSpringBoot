package com.himalaya.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.BaseTestCase;
import com.himalaya.ai.domain.UserDO;
import com.himalaya.ai.mapper.UserMapper;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年7月26日 上午11:05:36 Description
 */
public class HimalayaUserMapperTest extends BaseTestCase {

	@Autowired
	UserMapper userMapper;

	@Test
	public void testGetAll() {

		List<UserDO> list = userMapper.getAll();
		LOGGER.info("Got User " + list.size());
		for (UserDO newsDO : list) {
			LOGGER.info("--" + newsDO.toString());
		}
	}
}
