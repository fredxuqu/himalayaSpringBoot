package com.himalaya.solr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.himalaya.solr.domain.TagsDO;
import com.himalaya.solr.mapper.TagsMapper;
import com.himalaya.solr.service.TagsService;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年9月5日 下午3:36:39
* Description
*/
@Service
public class TagsServiceImpl implements TagsService {

	@Autowired
	private TagsMapper tagsMapper;
	
	@Override
	public List<TagsDO> getAll() {
		// TODO Auto-generated method stub
		return tagsMapper.getAll();
	}

	@Override
	public TagsDO getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(TagsDO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(TagsDO user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
