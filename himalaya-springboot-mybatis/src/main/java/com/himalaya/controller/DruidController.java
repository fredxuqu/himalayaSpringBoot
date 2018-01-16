package com.himalaya.controller;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.himalaya.domain.NewsDO;
import com.himalaya.repository.HimalayaDao;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年1月16日 下午4:02:33
* Description
*/

@Component("controller")
@RequestMapping("/search")
public class DruidController {

	private final Logger logger = LoggerFactory.getLogger(DruidController.class);

	@Autowired
	private HimalayaDao himalayaDao;

	@RequestMapping(value = "/listall", method = RequestMethod.GET, produces = "application/json;charset=UTF-8")
	public @ResponseBody String searchTags() {

		logger.info("List All Records!");

		List<NewsDO> news = null;
		
		JSONObject resultJSON = null;

		try {
			news = himalayaDao.getAll();
			resultJSON = new JSONObject(news);
			logger.debug("news : {} ", resultJSON.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
			logger.error("Searching tags error, msg:", e.getMessage());
		}

		return resultJSON.toString();
	}
}
