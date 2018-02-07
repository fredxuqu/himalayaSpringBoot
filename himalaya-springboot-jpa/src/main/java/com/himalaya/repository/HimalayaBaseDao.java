package com.himalaya.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.himalaya.domain.NewsDO;
import com.himalaya.repository.base.BaseRepository;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午3:00:02
* Description
*/
public interface HimalayaBaseDao extends BaseRepository<NewsDO, Long> , JpaSpecificationExecutor<NewsDO> {
	
	public NewsDO findByTitle(String title);
	
	public NewsDO findById(long id);
}
