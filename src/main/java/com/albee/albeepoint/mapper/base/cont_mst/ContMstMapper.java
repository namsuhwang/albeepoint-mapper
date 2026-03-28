package com.albee.albeepoint.mapper.base.cont_mst;

import com.albee.albeepoint.mapper.base.cont_mst.ContMst;
import com.albee.albeepoint.mapper.base.cont_mst.ContMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ContMstMapper {
    long countByExample(ContMstExample example);

    int deleteByExample(ContMstExample example);

    int deleteByPrimaryKey(Long contNo);

    int insert(ContMst row);

    int insertSelective(ContMst row);

    List<ContMst> selectByExample(ContMstExample example);

    ContMst selectByPrimaryKey(Long contNo);

    int updateByExampleSelective(@Param("row") ContMst row, @Param("example") ContMstExample example);

    int updateByExample(@Param("row") ContMst row, @Param("example") ContMstExample example);

    int updateByPrimaryKeySelective(ContMst row);

    int updateByPrimaryKey(ContMst row);
}