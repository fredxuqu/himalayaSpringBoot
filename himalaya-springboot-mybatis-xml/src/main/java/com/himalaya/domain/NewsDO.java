package com.himalaya.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年9月18日 下午10:46:08 Description
 */
@Data
public class NewsDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String title;
	private String content;
	private String author;
	private int type;
	private Date publishTime;
	private Date createTime;
	private Date updateTime;

	public NewsDO() {
		super();
	}

	public NewsDO(int id, String title, String content, String author, int type) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.author = author;
		this.type = type;
	}
}