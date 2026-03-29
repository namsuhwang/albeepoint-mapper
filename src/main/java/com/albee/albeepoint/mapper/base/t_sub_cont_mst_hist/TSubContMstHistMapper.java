package com.albee.albeepoint.mapper.base.t_sub_cont_mst_hist;

import com.albee.albeepoint.mapper.base.t_sub_cont_mst_hist.TSubContMstHist;
import com.albee.albeepoint.mapper.base.t_sub_cont_mst_hist.TSubContMstHistExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TSubContMstHistMapper {
    long countByExample(TSubContMstHistExample example);

    int deleteByExample(TSubContMstHistExample example);

    int deleteByPrimaryKey(@Param("contNo") Long contNo, @Param("contSeq") Long contSeq, @Param("subContHistSeq") Long subContHistSeq);

    int insert(TSubContMstHist row);

    int insertSelective(TSubContMstHist row);

    List<TSubContMstHist> selectByExample(TSubContMstHistExample example);

    TSubContMstHist selectByPrimaryKey(@Param("contNo") Long contNo, @Param("contSeq") Long contSeq, @Param("subContHistSeq") Long subContHistSeq);

    int updateByExampleSelective(@Param("row") TSubContMstHist row, @Param("example") TSubContMstHistExample example);

    int updateByExample(@Param("row") TSubContMstHist row, @Param("example") TSubContMstHistExample example);

    int updateByPrimaryKeySelective(TSubContMstHist row);

    int updateByPrimaryKey(TSubContMstHist row);
}