package com.albee.albeepoint.mapper.base.t_isu_target;

import com.albee.albeepoint.mapper.base.t_isu_target.TIsuTarget;
import com.albee.albeepoint.mapper.base.t_isu_target.TIsuTargetExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TIsuTargetMapper {
    long countByExample(TIsuTargetExample example);

    int deleteByExample(TIsuTargetExample example);

    int deleteByPrimaryKey(Long isuTargetSno);

    int insert(TIsuTarget row);

    int insertSelective(TIsuTarget row);

    List<TIsuTarget> selectByExample(TIsuTargetExample example);

    TIsuTarget selectByPrimaryKey(Long isuTargetSno);

    int updateByExampleSelective(@Param("row") TIsuTarget row, @Param("example") TIsuTargetExample example);

    int updateByExample(@Param("row") TIsuTarget row, @Param("example") TIsuTargetExample example);

    int updateByPrimaryKeySelective(TIsuTarget row);

    int updateByPrimaryKey(TIsuTarget row);
}