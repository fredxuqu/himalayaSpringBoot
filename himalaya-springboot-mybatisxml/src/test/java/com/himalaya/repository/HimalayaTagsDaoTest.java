package com.himalaya.repository;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.BaseTestCase;
import com.himalaya.domain.TagsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:05:36
* Description
*/
public class HimalayaTagsDaoTest extends BaseTestCase {
	
	@Autowired
	HimalayaTagsDAO himalayaTagsDao;
	
	@Test
	public void test01GetAll(){
		
		List<TagsDO> tagList = himalayaTagsDao.getAll();
		LOGGER.info("Got tags " + tagList.size());
		for (TagsDO tagsDO : tagList) {
			LOGGER.info("--" + tagsDO.toString());
		}
	}
        
    @Test
    public void test02GetOne(){
    	TagsDO tag = himalayaTagsDao.getOne(new Integer(1001));
    	LOGGER.info(tag.toString());
    }
	
    @Test
    public void test03Insert(){
    	TagsDO tag = new TagsDO();
    	tag.setId(1234);
    	tag.setTagName("Fredxu");
    	tag.setStatus("A");
    	tag.setPublishDate(new Date());
    	tag.setLastModifyDate(new Date());
    	himalayaTagsDao.insert(tag);
    }
    
    @Test
    public void test04Update(){
    	TagsDO tag = new TagsDO();
    	tag.setId(1234);
    	tag.setTagName("Wendy Xu");
    	tag.setStatus("D");
    	himalayaTagsDao.update(tag);
    }
 
    @Test
    public void test05Delete(){
    	himalayaTagsDao.delete(1234);
    }
}
