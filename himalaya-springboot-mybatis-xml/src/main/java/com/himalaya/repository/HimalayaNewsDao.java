package com.himalaya.repository;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.himalaya.domain.NewsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:00:06
* Description
*/
@Mapper
public interface HimalayaNewsDao {
	
    List<NewsDO> getAll();
    
    NewsDO getById(Integer id);
 
    void insert(NewsDO user);
 
    void update(NewsDO user);
 
    void delete(Integer id);
    
    List<Map<String, Object>> getByDynamicSQL(Map<String, String> paramsMap);
}
