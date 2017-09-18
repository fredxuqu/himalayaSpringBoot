package com.himalaya.domain;

import java.io.Serializable;
import java.util.Date;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年9月18日 下午10:46:08
* Description
*/
public class TagsDO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String tagName;
	private String status;
	private Date publishDate;
	private Date lastModifyDate;
	
	public TagsDO() {
		super();
	}
	
	public TagsDO(int id, String tagName, String status, Date publishDate, Date lastModifyDate) {
		super();
		this.id = id;
		this.tagName = tagName;
		this.status = status;
		this.publishDate = publishDate;
		this.lastModifyDate = lastModifyDate;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTagName() {
		return tagName;
	}
	public void setTagName(String tagName) {
		this.tagName = tagName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Date getLastModifyDate() {
		return lastModifyDate;
	}
	public void setLastModifyDate(Date lastModifyDate) {
		this.lastModifyDate = lastModifyDate;
	}
	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("id: " + id);
		sb.append(" tagName: " + tagName);
		sb.append(" status: " + status);
		return sb.toString();
	}
}