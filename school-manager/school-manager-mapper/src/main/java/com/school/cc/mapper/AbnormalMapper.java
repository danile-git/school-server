package com.school.cc.mapper;

import com.school.cc.pojo.Abnormal;
import com.school.cc.pojo.AbnormalExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AbnormalMapper {
    int countByExample(AbnormalExample example);

    int deleteByExample(AbnormalExample example);

    int deleteByPrimaryKey(String id);

    int insert(Abnormal record);

    int insertSelective(Abnormal record);

    List<Abnormal> selectByExample(AbnormalExample example);

    Abnormal selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Abnormal record, @Param("example") AbnormalExample example);

    int updateByExample(@Param("record") Abnormal record, @Param("example") AbnormalExample example);

    int updateByPrimaryKeySelective(Abnormal record);

    int updateByPrimaryKey(Abnormal record);
}