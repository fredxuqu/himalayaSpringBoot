package com.himalaya.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.himalaya.domain.TagsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年8月16日 下午3:00:02
* Description
*/
@Repository
public interface HimalayaTagsDao extends JpaRepository<TagsDO, Long>{

}
