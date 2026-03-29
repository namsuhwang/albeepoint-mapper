package com.albee.albeepoint.mapper.base.t_pt_mst;

import com.albee.albeepoint.mapper.base.t_pt_mst.TPtMst;
import com.albee.albeepoint.mapper.base.t_pt_mst.TPtMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPtMstMapper {
    long countByExample(TPtMstExample example);

    int deleteByExample(TPtMstExample example);

    int deleteByPrimaryKey(Long ptNo);

    int insert(TPtMst row);

    int insertSelective(TPtMst row);

    List<TPtMst> selectByExample(TPtMstExample example);

    TPtMst selectByPrimaryKey(Long ptNo);

    int updateByExampleSelective(@Param("row") TPtMst row, @Param("example") TPtMstExample example);

    int updateByExample(@Param("row") TPtMst row, @Param("example") TPtMstExample example);

    int updateByPrimaryKeySelective(TPtMst row);

    int updateByPrimaryKey(TPtMst row);
}