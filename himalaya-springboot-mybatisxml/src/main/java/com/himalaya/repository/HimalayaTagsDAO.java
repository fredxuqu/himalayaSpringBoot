package com.himalaya.repository;

import java.util.List;

import com.himalaya.domain.TagsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年9月19日 上午1:41:01
* Description
*/
public interface HimalayaTagsDAO {
	List<TagsDO> getAll();
    TagsDO getOne(Integer id);
    void insert(TagsDO user);
    void update(TagsDO user);
    void delete(Integer id);
}
