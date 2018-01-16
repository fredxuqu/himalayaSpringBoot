package com.himalaya.domain;

import java.io.Serializable;
import java.util.Date;

import org.json.JSONObject;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年9月18日 下午10:46:08 Description
 */
public class NewsDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private String content;
	private String auther;
	private int type;
	private Date publishTime;
	private Date createTime;
	private Date updateTime;

	public NewsDO() {
		super();
	}
	
	public NewsDO(int id, String title, String content, String auther, int type) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.auther = auther;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	
	public String toString(){
		return new JSONObject(this).toString();
	}
}