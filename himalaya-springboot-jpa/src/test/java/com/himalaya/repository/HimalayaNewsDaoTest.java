package com.himalaya.repository;

import java.util.Date;
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
public class HimalayaNewsDaoTest extends BaseTestCase {
	
	@Autowired
	HimalayaNewsDao himalayaNewsDao;
	
	@Test
	public void testGetAll(){
		
		List<NewsDO> list = himalayaNewsDao.findAll();
		LOGGER.info("Got news " + list.size());
		for (NewsDO newsDO : list) {
			LOGGER.info("--" + newsDO.toString());
		}
	}
    
    @Test
    public void testGetById(){
    	NewsDO news = himalayaNewsDao.findOne(new Long(1));
    	LOGGER.info(news.toString());
    }
	
    @Test
    public void testInsert(){
    	NewsDO news = new NewsDO();
    	news.setId(5);
    	news.setTitle("BitCoin related news");
    	news.setContent("----------");
    	news.setType(3);
    	news.setAuthor("Fred");
    	news.setPublishTime(new Date());
    	himalayaNewsDao.save(news);
    }
    
//    @Test
//    public void testUpdate(){
//    	NewsDO news = new NewsDO();
//    	news.setId(5);
//    	news.setContent("$$$$$$$$$$");
//    	himalayaNewsDao.(news);
//    }
 
    @Test
    public void testDelete(){
    	himalayaNewsDao.delete(new Long(5));
    }
}
