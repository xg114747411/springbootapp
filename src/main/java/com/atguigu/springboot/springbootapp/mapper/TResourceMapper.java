package com.atguigu.springboot.springbootapp.mapper;

import com.atguigu.springboot.springbootapp.bean.TResource;
import com.atguigu.springboot.springbootapp.bean.TResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TResourceMapper {
    long countByExample(TResourceExample example);

    int deleteByExample(TResourceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TResource record);

    int insertSelective(TResource record);

    List<TResource> selectByExample(TResourceExample example);

    TResource selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TResource record, @Param("example") TResourceExample example);

    int updateByExample(@Param("record") TResource record, @Param("example") TResourceExample example);

    int updateByPrimaryKeySelective(TResource record);

    int updateByPrimaryKey(TResource record);
}