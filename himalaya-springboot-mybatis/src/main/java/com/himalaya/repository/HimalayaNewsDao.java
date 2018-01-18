package com.himalaya.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.himalaya.domain.NewsDO;

/**
* @author: xuqu
* @E-mail: fredxuqu@163.com
* @version 
* 2017年7月26日 上午11:00:06
* Description
*/
public interface HimalayaNewsDao {

	@Select("SELECT * FROM TB_NEWS")
    @Results({
        @Result(property = "id",  column = "ID"),
        @Result(property = "title", column = "TITLE"),
        @Result(property = "content", column = "CONTENT"),
        @Result(property = "author", column = "AUTHOR"),
        @Result(property = "type", column = "TYPE"),
        @Result(property = "publishTime", column = "PUBLISH_TIME")
    })
    List<NewsDO> getAll();
   
    @Select("SELECT * FROM TB_NEWS WHERE id = #{id}")
    @Results({
    	@Result(property = "id",  column = "ID"),
        @Result(property = "title", column = "TITLE"),
        @Result(property = "content", column = "CONTENT"),
        @Result(property = "author", column = "AUTHOR"),
        @Result(property = "type", column = "TYPE"),
        @Result(property = "publishTime", column = "PUBLISH_TIME")
    })
    NewsDO getById(@Param("id") Integer id);
 
    @Insert("INSERT INTO TB_NEWS(ID,TITLE,CONTENT,AUTHOR,TYPE,PUBLISH_TIME) "
    		+ "VALUES(#{id}, #{title}, #{content}, #{author}, #{type}, #{publishTime})")
    void insert(NewsDO news);
 
    @Update("UPDATE TB_NEWS SET CONTENT=#{content} WHERE id =#{id}")
    void update(NewsDO news);
 
    @Delete("DELETE FROM TB_NEWS WHERE id =#{id}")
    void delete(@Param("id") Integer id);
}
