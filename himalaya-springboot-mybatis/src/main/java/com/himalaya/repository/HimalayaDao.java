package com.himalaya.repository;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.himalaya.domain.NewsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:00:06
* Description
*/
public interface HimalayaDao {

	@Select("SELECT * FROM TB_NEWS")
    @Results({
        @Result(property = "id",  column = "ID"),
        @Result(property = "title", column = "TITLE"),
        @Result(property = "content", column = "CONTENT"),
        @Result(property = "auther", column = "AUTHER"),
        @Result(property = "type", column = "TYPE"),
        @Result(property = "publishTime", column = "PUBLISH_TIME")
    })
    List<NewsDO> getAll();
    /* 
    @Select("SELECT * FROM TB_TAGS WHERE id = #{id}")
    @Results({
        @Result(property = "id",  column = "ID"),
        @Result(property = "tagName", column = "TAG_NAME"),
        @Result(property = "status", column = "STATUS"),
        @Result(property = "publishDate", column = "PUBLISH_DATE"),
        @Result(property = "lastModifyDate", column = "LASTMODIFY_DATE")
    })
    NewsDO getOne(Integer id);
 
    @Insert("INSERT INTO TB_TAGS(ID,TAG_NAME,STATUS,PUBLISH_DATE,LASTMODIFY_DATE) "
    		+ "VALUES(#{id}, #{tagName}, #{status}, #{publishDate}, #{lastModifyDate})")
    void insert(NewsDO user);
 
    @Update("UPDATE TB_TAGS SET tag_name=#{tagName},status=#{status} WHERE id =#{id}")
    void update(NewsDO user);
 
    @Delete("DELETE FROM TB_TAGS WHERE id =#{id}")
    void delete(Integer id);
    */
}
