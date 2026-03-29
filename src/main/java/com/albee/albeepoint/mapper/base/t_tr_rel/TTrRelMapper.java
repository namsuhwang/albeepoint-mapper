package com.albee.albeepoint.mapper.base.t_tr_rel;

import com.albee.albeepoint.mapper.base.t_tr_rel.TTrRel;
import com.albee.albeepoint.mapper.base.t_tr_rel.TTrRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TTrRelMapper {
    long countByExample(TTrRelExample example);

    int deleteByExample(TTrRelExample example);

    int deleteByPrimaryKey(@Param("trRelNo") Long trRelNo, @Param("trSno") Long trSno);

    int insert(TTrRel row);

    int insertSelective(TTrRel row);

    List<TTrRel> selectByExample(TTrRelExample example);

    TTrRel selectByPrimaryKey(@Param("trRelNo") Long trRelNo, @Param("trSno") Long trSno);

    int updateByExampleSelective(@Param("row") TTrRel row, @Param("example") TTrRelExample example);

    int updateByExample(@Param("row") TTrRel row, @Param("example") TTrRelExample example);

    int updateByPrimaryKeySelective(TTrRel row);

    int updateByPrimaryKey(TTrRel row);
}