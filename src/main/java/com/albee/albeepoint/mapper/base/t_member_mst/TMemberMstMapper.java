package com.albee.albeepoint.mapper.base.t_member_mst;

import com.albee.albeepoint.mapper.base.t_member_mst.TMemberMst;
import com.albee.albeepoint.mapper.base.t_member_mst.TMemberMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMemberMstMapper {
    long countByExample(TMemberMstExample example);

    int deleteByExample(TMemberMstExample example);

    int deleteByPrimaryKey(Long memberNo);

    int insert(TMemberMst row);

    int insertSelective(TMemberMst row);

    List<TMemberMst> selectByExample(TMemberMstExample example);

    TMemberMst selectByPrimaryKey(Long memberNo);

    int updateByExampleSelective(@Param("row") TMemberMst row, @Param("example") TMemberMstExample example);

    int updateByExample(@Param("row") TMemberMst row, @Param("example") TMemberMstExample example);

    int updateByPrimaryKeySelective(TMemberMst row);

    int updateByPrimaryKey(TMemberMst row);
}