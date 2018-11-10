package com.himalaya.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.himalaya.domain.TagsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:00:06
* Description
*/
@Mapper
public interface HimalayaTagsDao {

    List<TagsDO> getAll();
    
    TagsDO getById(Integer id);
    
    void insert(TagsDO user);
 
    void update(TagsDO user);
 
    void delete(Integer id);
}
