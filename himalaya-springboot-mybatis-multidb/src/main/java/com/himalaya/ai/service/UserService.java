package com.himalaya.ai.service;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.himalaya.ai.domain.UserDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:00:06
* Description
*/
@Mapper
public interface UserService {

    List<UserDO> getAll();
}
