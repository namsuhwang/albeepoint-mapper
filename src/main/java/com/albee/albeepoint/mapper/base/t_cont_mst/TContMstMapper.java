package com.albee.albeepoint.mapper.base.t_cont_mst;

import com.albee.albeepoint.mapper.base.t_cont_mst.TContMst;
import com.albee.albeepoint.mapper.base.t_cont_mst.TContMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TContMstMapper {
    long countByExample(TContMstExample example);

    int deleteByExample(TContMstExample example);

    int deleteByPrimaryKey(Long contNo);

    int insert(TContMst row);

    int insertSelective(TContMst row);

    List<TContMst> selectByExample(TContMstExample example);

    TContMst selectByPrimaryKey(Long contNo);

    int updateByExampleSelective(@Param("row") TContMst row, @Param("example") TContMstExample example);

    int updateByExample(@Param("row") TContMst row, @Param("example") TContMstExample example);

    int updateByPrimaryKeySelective(TContMst row);

    int updateByPrimaryKey(TContMst row);
}