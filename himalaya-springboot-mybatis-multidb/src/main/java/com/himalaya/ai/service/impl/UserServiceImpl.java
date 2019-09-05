package com.himalaya.ai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himalaya.ai.domain.UserDO;
import com.himalaya.ai.mapper.UserMapper;
import com.himalaya.ai.service.UserService;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年9月5日 下午3:34:01
* Description
*/
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<UserDO> getAll() {
		return userMapper.getAll();
	}
}
