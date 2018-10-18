package com.himalaya.dto;
/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2018年9月12日 下午4:36:25
* Description
*/
public class ParamDTO {

	private String flag;
	private String status;
	
	public ParamDTO() {
	}
	
	public ParamDTO(String flag, String status) {
		super();
		this.flag = flag;
		this.status = status;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
}
