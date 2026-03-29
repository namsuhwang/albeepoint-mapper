package com.albee.albeepoint.mapper.base.t_member_pid;

import com.albee.albeepoint.mapper.base.t_member_pid.TMemberPid;
import com.albee.albeepoint.mapper.base.t_member_pid.TMemberPidExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TMemberPidMapper {
    long countByExample(TMemberPidExample example);

    int deleteByExample(TMemberPidExample example);

    int deleteByPrimaryKey(Long pidNo);

    int insert(TMemberPid row);

    int insertSelective(TMemberPid row);

    List<TMemberPid> selectByExample(TMemberPidExample example);

    TMemberPid selectByPrimaryKey(Long pidNo);

    int updateByExampleSelective(@Param("row") TMemberPid row, @Param("example") TMemberPidExample example);

    int updateByExample(@Param("row") TMemberPid row, @Param("example") TMemberPidExample example);

    int updateByPrimaryKeySelective(TMemberPid row);

    int updateByPrimaryKey(TMemberPid row);
}