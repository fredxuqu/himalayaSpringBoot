package com.himalaya.solr.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class TagsDO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String tagName;
	private int type;
	private int status;
	private int rank;
	private Date createTime;
	private String createUser;
	private Date modifyTime;
	private String modifyUser;
}
