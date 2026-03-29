package com.albee.albeepoint.mapper.base.t_cont_record;

import com.albee.albeepoint.mapper.base.t_cont_record.TContRecord;
import com.albee.albeepoint.mapper.base.t_cont_record.TContRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TContRecordMapper {
    long countByExample(TContRecordExample example);

    int deleteByExample(TContRecordExample example);

    int deleteByPrimaryKey(@Param("contNo") Long contNo, @Param("contRecordGbCd") String contRecordGbCd, @Param("orgNo") Long orgNo, @Param("brchNo") Long brchNo);

    int insert(TContRecord row);

    int insertSelective(TContRecord row);

    List<TContRecord> selectByExample(TContRecordExample example);

    TContRecord selectByPrimaryKey(@Param("contNo") Long contNo, @Param("contRecordGbCd") String contRecordGbCd, @Param("orgNo") Long orgNo, @Param("brchNo") Long brchNo);

    int updateByExampleSelective(@Param("row") TContRecord row, @Param("example") TContRecordExample example);

    int updateByExample(@Param("row") TContRecord row, @Param("example") TContRecordExample example);

    int updateByPrimaryKeySelective(TContRecord row);

    int updateByPrimaryKey(TContRecord row);
}