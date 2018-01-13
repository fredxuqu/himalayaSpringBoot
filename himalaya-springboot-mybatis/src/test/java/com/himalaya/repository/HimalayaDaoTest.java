package com.himalaya.repository;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.BaseTestCase;
import com.himalaya.domain.NewsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:05:36
* Description
*/
public class HimalayaDaoTest extends BaseTestCase {
	
	@Autowired
	HimalayaDao himalayaDao;
	
	@Test
	public void test01GetAll(){
		
		List<NewsDO> tagList = himalayaDao.getAll();
		LOGGER.info("Got tags " + tagList.size());
		for (NewsDO tagsDO : tagList) {
			LOGGER.info("--" + tagsDO.toString());
		}
	}
       
	/*
    @Test
    public void test02GetOne(){
    	NewsDO tag = himalayaDao.getOne(new Integer(1001));
    	LOGGER.info(tag.toString());
    }
	
    @Test
    public void test03Insert(){
    	NewsDO tag = new NewsDO();
    	tag.setId(1234);
    	tag.setTagName("Fredxu");
    	tag.setStatus("A");
    	tag.setPublishDate(new Date());
    	tag.setLastModifyDate(new Date());
    	himalayaDao.insert(tag);
    }
    
    @Test
    public void test04Update(){
    	NewsDO tag = new NewsDO();
    	tag.setId(1234);
    	tag.setTagName("Wendy Xu");
    	tag.setStatus("D");
    	himalayaDao.update(tag);
    }
 
    @Test
    public void test05Delete(){
    	himalayaDao.delete(1234);
    }
    */
}
