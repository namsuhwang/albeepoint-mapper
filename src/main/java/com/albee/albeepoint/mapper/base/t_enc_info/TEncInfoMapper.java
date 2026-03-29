package com.albee.albeepoint.mapper.base.t_enc_info;

import com.albee.albeepoint.mapper.base.t_enc_info.TEncInfo;
import com.albee.albeepoint.mapper.base.t_enc_info.TEncInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TEncInfoMapper {
    long countByExample(TEncInfoExample example);

    int deleteByExample(TEncInfoExample example);

    int deleteByPrimaryKey(@Param("targetGbCd") String targetGbCd, @Param("targetVal") String targetVal);

    int insert(TEncInfo row);

    int insertSelective(TEncInfo row);

    List<TEncInfo> selectByExample(TEncInfoExample example);

    TEncInfo selectByPrimaryKey(@Param("targetGbCd") String targetGbCd, @Param("targetVal") String targetVal);

    int updateByExampleSelective(@Param("row") TEncInfo row, @Param("example") TEncInfoExample example);

    int updateByExample(@Param("row") TEncInfo row, @Param("example") TEncInfoExample example);

    int updateByPrimaryKeySelective(TEncInfo row);

    int updateByPrimaryKey(TEncInfo row);
}