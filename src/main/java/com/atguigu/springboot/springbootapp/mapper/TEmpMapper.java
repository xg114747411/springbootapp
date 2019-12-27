package com.atguigu.springboot.springbootapp.mapper;

import com.atguigu.springboot.springbootapp.bean.TEmp;
import com.atguigu.springboot.springbootapp.bean.TEmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEmpMapper {
    long countByExample(TEmpExample example);

    int deleteByExample(TEmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TEmp record);

    int insertSelective(TEmp record);

    List<TEmp> selectByExample(TEmpExample example);

    TEmp selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByExample(@Param("record") TEmp record, @Param("example") TEmpExample example);

    int updateByPrimaryKeySelective(TEmp record);

    int updateByPrimaryKey(TEmp record);
}