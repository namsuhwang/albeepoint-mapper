package com.albee.albeepoint.mapper.base.t_cont_mst_hist;

import com.albee.albeepoint.mapper.base.t_cont_mst_hist.TContMstHist;
import com.albee.albeepoint.mapper.base.t_cont_mst_hist.TContMstHistExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TContMstHistMapper {
    long countByExample(TContMstHistExample example);

    int deleteByExample(TContMstHistExample example);

    int deleteByPrimaryKey(@Param("contNo") Long contNo, @Param("contHistSeq") Long contHistSeq);

    int insert(TContMstHist row);

    int insertSelective(TContMstHist row);

    List<TContMstHist> selectByExample(TContMstHistExample example);

    TContMstHist selectByPrimaryKey(@Param("contNo") Long contNo, @Param("contHistSeq") Long contHistSeq);

    int updateByExampleSelective(@Param("row") TContMstHist row, @Param("example") TContMstHistExample example);

    int updateByExample(@Param("row") TContMstHist row, @Param("example") TContMstHistExample example);

    int updateByPrimaryKeySelective(TContMstHist row);

    int updateByPrimaryKey(TContMstHist row);
}