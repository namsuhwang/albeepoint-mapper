package com.albee.albeepoint.mapper.base.t_org_mst;

import com.albee.albeepoint.mapper.base.t_org_mst.TOrgMst;
import com.albee.albeepoint.mapper.base.t_org_mst.TOrgMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TOrgMstMapper {
    long countByExample(TOrgMstExample example);

    int deleteByExample(TOrgMstExample example);

    int deleteByPrimaryKey(Long orgNo);

    int insert(TOrgMst row);

    int insertSelective(TOrgMst row);

    List<TOrgMst> selectByExample(TOrgMstExample example);

    TOrgMst selectByPrimaryKey(Long orgNo);

    int updateByExampleSelective(@Param("row") TOrgMst row, @Param("example") TOrgMstExample example);

    int updateByExample(@Param("row") TOrgMst row, @Param("example") TOrgMstExample example);

    int updateByPrimaryKeySelective(TOrgMst row);

    int updateByPrimaryKey(TOrgMst row);
}