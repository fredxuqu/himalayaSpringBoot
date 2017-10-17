package com.himalaya;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年10月17日 下午3:18:06
* Description
*/

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class BaseTestCase {
	protected static final Logger LOGGER = LoggerFactory.getLogger(BaseTestCase.class);
}
