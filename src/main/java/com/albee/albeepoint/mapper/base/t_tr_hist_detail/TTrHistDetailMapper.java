package com.albee.albeepoint.mapper.base.t_tr_hist_detail;

import com.albee.albeepoint.mapper.base.t_tr_hist_detail.TTrHistDetail;
import com.albee.albeepoint.mapper.base.t_tr_hist_detail.TTrHistDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TTrHistDetailMapper {
    long countByExample(TTrHistDetailExample example);

    int deleteByExample(TTrHistDetailExample example);

    int deleteByPrimaryKey(@Param("trSno") Long trSno, @Param("trSeq") Long trSeq);

    int insert(TTrHistDetail row);

    int insertSelective(TTrHistDetail row);

    List<TTrHistDetail> selectByExample(TTrHistDetailExample example);

    TTrHistDetail selectByPrimaryKey(@Param("trSno") Long trSno, @Param("trSeq") Long trSeq);

    int updateByExampleSelective(@Param("row") TTrHistDetail row, @Param("example") TTrHistDetailExample example);

    int updateByExample(@Param("row") TTrHistDetail row, @Param("example") TTrHistDetailExample example);

    int updateByPrimaryKeySelective(TTrHistDetail row);

    int updateByPrimaryKey(TTrHistDetail row);
}