package com.albee.albeepoint.mapper.cont_org;

import com.albee.albeepoint.mapper.cont_org.ContOrg;
import com.albee.albeepoint.mapper.cont_org.ContOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ContOrgMapper {
    long countByExample(ContOrgExample example);

    int deleteByExample(ContOrgExample example);

    int deleteByPrimaryKey(@Param("contNo") Long contNo, @Param("orgNo") Long orgNo);

    int insert(ContOrg row);

    int insertSelective(ContOrg row);

    List<ContOrg> selectByExample(ContOrgExample example);

    ContOrg selectByPrimaryKey(@Param("contNo") Long contNo, @Param("orgNo") Long orgNo);

    int updateByExampleSelective(@Param("row") ContOrg row, @Param("example") ContOrgExample example);

    int updateByExample(@Param("row") ContOrg row, @Param("example") ContOrgExample example);

    int updateByPrimaryKeySelective(ContOrg row);

    int updateByPrimaryKey(ContOrg row);
}