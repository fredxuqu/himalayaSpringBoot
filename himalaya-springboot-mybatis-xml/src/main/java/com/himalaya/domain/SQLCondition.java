package com.himalaya.domain;

import java.io.Serializable;
import java.util.Map;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年4月15日 上午11:23:44
* Description
*/
public class SQLCondition implements Serializable{

	private String tableName;
	private String columnName;
	private Map<String, String> condition;
}
