package com.albee.albeepoint.mapper.base.t_tr_hist;

import com.albee.albeepoint.mapper.base.t_tr_hist.TTrHist;
import com.albee.albeepoint.mapper.base.t_tr_hist.TTrHistExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TTrHistMapper {
    long countByExample(TTrHistExample example);

    int deleteByExample(TTrHistExample example);

    int deleteByPrimaryKey(Long trSno);

    int insert(TTrHist row);

    int insertSelective(TTrHist row);

    List<TTrHist> selectByExample(TTrHistExample example);

    TTrHist selectByPrimaryKey(Long trSno);

    int updateByExampleSelective(@Param("row") TTrHist row, @Param("example") TTrHistExample example);

    int updateByExample(@Param("row") TTrHist row, @Param("example") TTrHistExample example);

    int updateByPrimaryKeySelective(TTrHist row);

    int updateByPrimaryKey(TTrHist row);
}