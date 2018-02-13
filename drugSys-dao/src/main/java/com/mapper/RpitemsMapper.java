package com.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.domain.Rpitems;
import com.domain.RpitemsExample;

public interface RpitemsMapper {
    int countByExample(RpitemsExample example);

    int deleteByExample(RpitemsExample example);

    int deleteByPrimaryKey(String rpitemid);

    int insert(Rpitems record);

    int insertSelective(Rpitems record);

    List<Rpitems> selectByExample(RpitemsExample example);

    Rpitems selectByPrimaryKey(String rpitemid);

    int updateByExampleSelective(@Param("record") Rpitems record, @Param("example") RpitemsExample example);

    int updateByExample(@Param("record") Rpitems record, @Param("example") RpitemsExample example);

    int updateByPrimaryKeySelective(Rpitems record);

    int updateByPrimaryKey(Rpitems record);
}