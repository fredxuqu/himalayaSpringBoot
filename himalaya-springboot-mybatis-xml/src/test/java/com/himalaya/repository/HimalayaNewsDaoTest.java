package com.himalaya.repository;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.himalaya.BaseTestCase;
import com.himalaya.domain.NewsDO;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年7月26日 上午11:05:36 Description
 */
public class HimalayaNewsDaoTest extends BaseTestCase {

	@Autowired
	HimalayaNewsDao himalayaNewsDao;

	@Test
	public void testGetAll() {

		List<NewsDO> list = himalayaNewsDao.getAll();
		LOGGER.info("Got news " + list.size());
		for (NewsDO newsDO : list) {
			LOGGER.info("--" + newsDO.toString());
		}
	}

	@Test
	public void testGetOne() {
		NewsDO news = himalayaNewsDao.getById(new Integer(1));
		LOGGER.info(news.toString());
	}

	@Test
	public void testInsert() {
		NewsDO news = new NewsDO();
		news.setId(5);
		news.setTitle("BitCoin related news");
		news.setContent("----------");
		news.setType(3);
		news.setAuthor("Fred");
		news.setPublishTime(new Date());
		himalayaNewsDao.insert(news);
	}

	@Test
	public void testUpdate() {
		NewsDO news = new NewsDO();
		news.setId(5);
		news.setContent("$$$$$$$$$$");
		himalayaNewsDao.update(news);
	}

	@Test
	public void testDelete() {
		himalayaNewsDao.delete(5);
	}

	@Test
	public void testGetByDynamicSQL() {
		Map<String, String> param = new HashMap<String, String>();
		param.put("columnName", "ID, TAG_NAME");
		param.put("tableName", "TB_TAGS");
		param.put("condition", "TYPE = 1 AND STATUS = 2");
		List<Map<String,Object>> list = himalayaNewsDao.getByDynamicSQL(param);
		System.out.println(list.size());
		list.forEach(item ->{
			System.out.println(item);
		});
	}
	
	/**
	 * condition
	 * 字段的条件和表列名的对应关系
	 * 
	 */
}
