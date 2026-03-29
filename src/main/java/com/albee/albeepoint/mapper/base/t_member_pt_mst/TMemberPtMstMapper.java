package com.albee.albeepoint.mapper.base.t_member_pt_mst;

import com.albee.albeepoint.mapper.base.t_member_pt_mst.TMemberPtMst;
import com.albee.albeepoint.mapper.base.t_member_pt_mst.TMemberPtMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMemberPtMstMapper {
    long countByExample(TMemberPtMstExample example);

    int deleteByExample(TMemberPtMstExample example);

    int deleteByPrimaryKey(Long memberPtNo);

    int insert(TMemberPtMst row);

    int insertSelective(TMemberPtMst row);

    List<TMemberPtMst> selectByExample(TMemberPtMstExample example);

    TMemberPtMst selectByPrimaryKey(Long memberPtNo);

    int updateByExampleSelective(@Param("row") TMemberPtMst row, @Param("example") TMemberPtMstExample example);

    int updateByExample(@Param("row") TMemberPtMst row, @Param("example") TMemberPtMstExample example);

    int updateByPrimaryKeySelective(TMemberPtMst row);

    int updateByPrimaryKey(TMemberPtMst row);
}