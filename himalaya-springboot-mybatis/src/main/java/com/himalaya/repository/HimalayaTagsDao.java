package com.himalaya.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.himalaya.domain.TagsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:00:06
* Description
*/
public interface HimalayaTagsDao {

	@Select("SELECT * FROM TB_TAGS")
    @Results({
        @Result(property = "id",  column = "ID"),
        @Result(property = "tagName", column = "TAG_NAME"),
        @Result(property = "type", column = "TYPE"),
        @Result(property = "status", column = "STATUS"),
        @Result(property = "rank", column = "RANK"),
        @Result(property = "createTime", column = "CREATE_TIME"),
        @Result(property = "createUser", column = "CREATE_USER"),
        @Result(property = "modifyTime", column = "MODIFY_TIME"),
        @Result(property = "modifyUser", column = "MODIFY_USER")
        
    })
    List<TagsDO> getAll();
    
    @Select("SELECT * FROM TB_TAGS WHERE id = #{id}")
    @Results({
    	@Result(property = "id",  column = "ID"),
        @Result(property = "tagName", column = "TAG_NAME"),
        @Result(property = "type", column = "TYPE"),
        @Result(property = "status", column = "STATUS"),
        @Result(property = "rank", column = "RANK"),
        @Result(property = "createTime", column = "CREATE_TIME"),
        @Result(property = "createUser", column = "CREATE_USER"),
        @Result(property = "modifyTime", column = "MODIFY_TIME"),
        @Result(property = "modifyUser", column = "MODIFY_USER")
    })
    TagsDO getById(@Param("id") Integer id);
 
    @Insert("INSERT INTO TB_TAGS(ID,TAG_NAME,TYPE,STATUS,RANK,CREATE_TIME,CREATE_USER,MODIFY_TIME,MODIFY_USER) "
    		+ "VALUES(#{id}, #{tagName}, #{type}, #{status}, #{rank}, #{createTime}, #{createUser}, #{modifyTime}, #{modifyUser})")
    void insert(TagsDO user);
 
    @Update("UPDATE TB_TAGS SET tag_name=#{tagName},status=#{status} WHERE id =#{id}")
    void update(TagsDO user);
 
    @Delete("DELETE FROM TB_TAGS WHERE id =#{id}")
    void delete(@Param("id") Integer id);
}
