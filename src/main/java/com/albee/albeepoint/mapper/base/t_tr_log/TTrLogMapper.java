package com.albee.albeepoint.mapper.base.t_tr_log;

import com.albee.albeepoint.mapper.base.t_tr_log.TTrLog;
import com.albee.albeepoint.mapper.base.t_tr_log.TTrLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TTrLogMapper {
    long countByExample(TTrLogExample example);

    int deleteByExample(TTrLogExample example);

    int deleteByPrimaryKey(@Param("trDt") String trDt, @Param("trId") String trId);

    int insert(TTrLog row);

    int insertSelective(TTrLog row);

    List<TTrLog> selectByExampleWithBLOBs(TTrLogExample example);

    List<TTrLog> selectByExample(TTrLogExample example);

    TTrLog selectByPrimaryKey(@Param("trDt") String trDt, @Param("trId") String trId);

    int updateByExampleSelective(@Param("row") TTrLog row, @Param("example") TTrLogExample example);

    int updateByExampleWithBLOBs(@Param("row") TTrLog row, @Param("example") TTrLogExample example);

    int updateByExample(@Param("row") TTrLog row, @Param("example") TTrLogExample example);

    int updateByPrimaryKeySelective(TTrLog row);

    int updateByPrimaryKeyWithBLOBs(TTrLog row);

    int updateByPrimaryKey(TTrLog row);
}