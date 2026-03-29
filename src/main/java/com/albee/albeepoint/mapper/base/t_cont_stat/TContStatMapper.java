package com.albee.albeepoint.mapper.base.t_cont_stat;

import com.albee.albeepoint.mapper.base.t_cont_stat.TContStat;
import com.albee.albeepoint.mapper.base.t_cont_stat.TContStatExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TContStatMapper {
    long countByExample(TContStatExample example);

    int deleteByExample(TContStatExample example);

    int deleteByPrimaryKey(@Param("baseDay") String baseDay, @Param("contNo") Long contNo, @Param("contStatGbCd") String contStatGbCd, @Param("orgCd") String orgCd, @Param("brchCd") String brchCd);

    int insert(TContStat row);

    int insertSelective(TContStat row);

    List<TContStat> selectByExample(TContStatExample example);

    TContStat selectByPrimaryKey(@Param("baseDay") String baseDay, @Param("contNo") Long contNo, @Param("contStatGbCd") String contStatGbCd, @Param("orgCd") String orgCd, @Param("brchCd") String brchCd);

    int updateByExampleSelective(@Param("row") TContStat row, @Param("example") TContStatExample example);

    int updateByExample(@Param("row") TContStat row, @Param("example") TContStatExample example);

    int updateByPrimaryKeySelective(TContStat row);

    int updateByPrimaryKey(TContStat row);
}