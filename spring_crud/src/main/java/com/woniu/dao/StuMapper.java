package com.woniu.dao;

import com.woniu.pojo.Stu;
import com.woniu.pojo.StuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuMapper {
    long countByExample(StuExample example);

    int deleteByExample(StuExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(Stu record);

    int insertSelective(Stu record);

    List<Stu> selectByExample(StuExample example);

    Stu selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") Stu record, @Param("example") StuExample example);

    int updateByExample(@Param("record") Stu record, @Param("example") StuExample example);

    int updateByPrimaryKeySelective(Stu record);

    int updateByPrimaryKey(Stu record);
}