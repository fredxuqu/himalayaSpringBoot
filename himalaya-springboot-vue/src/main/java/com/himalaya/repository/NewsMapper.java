package com.himalaya.repository;

import com.himalaya.domain.NewsDO;
import com.himalaya.domain.NewsDOExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsMapper {
    long countByExample(NewsDOExample example);

    int deleteByExample(NewsDOExample example);

    int insert(NewsDO record);

    int insertSelective(NewsDO record);

    List<NewsDO> selectByExample(NewsDOExample example);

    int updateByExampleSelective(@Param("record") NewsDO record, @Param("example") NewsDOExample example);

    int updateByExample(@Param("record") NewsDO record, @Param("example") NewsDOExample example);
}