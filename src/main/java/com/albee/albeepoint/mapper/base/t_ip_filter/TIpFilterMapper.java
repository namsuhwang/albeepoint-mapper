package com.albee.albeepoint.mapper.base.t_ip_filter;

import com.albee.albeepoint.mapper.base.t_ip_filter.TIpFilter;
import com.albee.albeepoint.mapper.base.t_ip_filter.TIpFilterExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TIpFilterMapper {
    long countByExample(TIpFilterExample example);

    int deleteByExample(TIpFilterExample example);

    int deleteByPrimaryKey(@Param("ipAddr") String ipAddr, @Param("contNo") Long contNo, @Param("bizRoleCd") String bizRoleCd);

    int insert(TIpFilter row);

    int insertSelective(TIpFilter row);

    List<TIpFilter> selectByExample(TIpFilterExample example);

    TIpFilter selectByPrimaryKey(@Param("ipAddr") String ipAddr, @Param("contNo") Long contNo, @Param("bizRoleCd") String bizRoleCd);

    int updateByExampleSelective(@Param("row") TIpFilter row, @Param("example") TIpFilterExample example);

    int updateByExample(@Param("row") TIpFilter row, @Param("example") TIpFilterExample example);

    int updateByPrimaryKeySelective(TIpFilter row);

    int updateByPrimaryKey(TIpFilter row);
}