package com.albee.albeepoint.mapper.base.t_cont_brch;

import com.albee.albeepoint.mapper.base.t_cont_brch.TContBrch;
import com.albee.albeepoint.mapper.base.t_cont_brch.TContBrchExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TContBrchMapper {
    long countByExample(TContBrchExample example);

    int deleteByExample(TContBrchExample example);

    int deleteByPrimaryKey(@Param("contNo") Long contNo, @Param("orgNo") Long orgNo, @Param("brchNo") Long brchNo);

    int insert(TContBrch row);

    int insertSelective(TContBrch row);

    List<TContBrch> selectByExample(TContBrchExample example);

    TContBrch selectByPrimaryKey(@Param("contNo") Long contNo, @Param("orgNo") Long orgNo, @Param("brchNo") Long brchNo);

    int updateByExampleSelective(@Param("row") TContBrch row, @Param("example") TContBrchExample example);

    int updateByExample(@Param("row") TContBrch row, @Param("example") TContBrchExample example);

    int updateByPrimaryKeySelective(TContBrch row);

    int updateByPrimaryKey(TContBrch row);
}