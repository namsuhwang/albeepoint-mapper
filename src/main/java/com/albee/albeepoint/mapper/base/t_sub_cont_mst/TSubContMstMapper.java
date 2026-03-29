package com.albee.albeepoint.mapper.base.t_sub_cont_mst;

import com.albee.albeepoint.mapper.base.t_sub_cont_mst.TSubContMst;
import com.albee.albeepoint.mapper.base.t_sub_cont_mst.TSubContMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TSubContMstMapper {
    long countByExample(TSubContMstExample example);

    int deleteByExample(TSubContMstExample example);

    int deleteByPrimaryKey(@Param("contNo") Long contNo, @Param("contSeq") Long contSeq);

    int insert(TSubContMst row);

    int insertSelective(TSubContMst row);

    List<TSubContMst> selectByExample(TSubContMstExample example);

    TSubContMst selectByPrimaryKey(@Param("contNo") Long contNo, @Param("contSeq") Long contSeq);

    int updateByExampleSelective(@Param("row") TSubContMst row, @Param("example") TSubContMstExample example);

    int updateByExample(@Param("row") TSubContMst row, @Param("example") TSubContMstExample example);

    int updateByPrimaryKeySelective(TSubContMst row);

    int updateByPrimaryKey(TSubContMst row);
}