package com.himalaya.ai.domain;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

/**
 * @author: xuqu
 * @E-mail: fredxuqu@163.com
 * @version 2017年9月18日 下午10:46:08 Description
 */
@Data
public class UserDO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private String userName;
	private String email;
	private String phone;
	private Date createTime;
	private String createUser;
	private Date modifyTime;
	private String modifyUser;
}