package com.albee.albeepoint.mapper.base.t_tr_hist_exp;

import com.albee.albeepoint.mapper.base.t_tr_hist_exp.TTrHistExp;
import com.albee.albeepoint.mapper.base.t_tr_hist_exp.TTrHistExpExample;
import java.time.LocalDateTime;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TTrHistExpMapper {
    long countByExample(TTrHistExpExample example);

    int deleteByExample(TTrHistExpExample example);

    int deleteByPrimaryKey(@Param("expDt") LocalDateTime expDt, @Param("ptNo") Long ptNo);

    int insert(TTrHistExp row);

    int insertSelective(TTrHistExp row);

    List<TTrHistExp> selectByExample(TTrHistExpExample example);

    TTrHistExp selectByPrimaryKey(@Param("expDt") LocalDateTime expDt, @Param("ptNo") Long ptNo);

    int updateByExampleSelective(@Param("row") TTrHistExp row, @Param("example") TTrHistExpExample example);

    int updateByExample(@Param("row") TTrHistExp row, @Param("example") TTrHistExpExample example);

    int updateByPrimaryKeySelective(TTrHistExp row);

    int updateByPrimaryKey(TTrHistExp row);
}