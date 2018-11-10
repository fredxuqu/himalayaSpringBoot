package com.himalaya.dto;
/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月12日 下午4:36:25
* Description
*/
public class UserDTO {

	// userId
	private String id;
	
	// userName
	private String name;
	
	public UserDTO() {
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
