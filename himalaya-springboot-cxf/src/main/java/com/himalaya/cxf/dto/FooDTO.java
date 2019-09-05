package com.himalaya.cxf.dto;

import java.io.Serializable;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2019年7月4日 上午11:43:25
* Description
*/
public class FooDTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String fooId;
	private String fooName;
	/**
	 * @return the fooId
	 */
	public String getFooId() {
		return fooId;
	}
	/**
	 * @param fooId the fooId to set
	 */
	public void setFooId(String fooId) {
		this.fooId = fooId;
	}
	/**
	 * @return the fooName
	 */
	public String getFooName() {
		return fooName;
	}
	/**
	 * @param fooName the fooName to set
	 */
	public void setFooName(String fooName) {
		this.fooName = fooName;
	}
}
