package com.albee.albeepoint.mapper.base.t_brch_mst;

import com.albee.albeepoint.mapper.base.t_brch_mst.TBrchMst;
import com.albee.albeepoint.mapper.base.t_brch_mst.TBrchMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TBrchMstMapper {
    long countByExample(TBrchMstExample example);

    int deleteByExample(TBrchMstExample example);

    int deleteByPrimaryKey(@Param("orgNo") Long orgNo, @Param("brchNo") Long brchNo);

    int insert(TBrchMst row);

    int insertSelective(TBrchMst row);

    List<TBrchMst> selectByExample(TBrchMstExample example);

    TBrchMst selectByPrimaryKey(@Param("orgNo") Long orgNo, @Param("brchNo") Long brchNo);

    int updateByExampleSelective(@Param("row") TBrchMst row, @Param("example") TBrchMstExample example);

    int updateByExample(@Param("row") TBrchMst row, @Param("example") TBrchMstExample example);

    int updateByPrimaryKeySelective(TBrchMst row);

    int updateByPrimaryKey(TBrchMst row);
}