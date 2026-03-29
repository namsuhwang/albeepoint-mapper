package com.albee.albeepoint.mapper.base.t_cont_rel;

import com.albee.albeepoint.mapper.base.t_cont_rel.TContRel;
import com.albee.albeepoint.mapper.base.t_cont_rel.TContRelExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TContRelMapper {
    long countByExample(TContRelExample example);

    int deleteByExample(TContRelExample example);

    int deleteByPrimaryKey(@Param("contRelNo") Long contRelNo, @Param("contRelSeq") Long contRelSeq);

    int insert(TContRel row);

    int insertSelective(TContRel row);

    List<TContRel> selectByExample(TContRelExample example);

    TContRel selectByPrimaryKey(@Param("contRelNo") Long contRelNo, @Param("contRelSeq") Long contRelSeq);

    int updateByExampleSelective(@Param("row") TContRel row, @Param("example") TContRelExample example);

    int updateByExample(@Param("row") TContRel row, @Param("example") TContRelExample example);

    int updateByPrimaryKeySelective(TContRel row);

    int updateByPrimaryKey(TContRel row);
}