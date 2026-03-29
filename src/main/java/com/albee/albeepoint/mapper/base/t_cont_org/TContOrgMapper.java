package com.albee.albeepoint.mapper.base.t_cont_org;

import com.albee.albeepoint.mapper.base.t_cont_org.TContOrg;
import com.albee.albeepoint.mapper.base.t_cont_org.TContOrgExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TContOrgMapper {
    long countByExample(TContOrgExample example);

    int deleteByExample(TContOrgExample example);

    int deleteByPrimaryKey(@Param("contNo") Long contNo, @Param("orgNo") Long orgNo);

    int insert(TContOrg row);

    int insertSelective(TContOrg row);

    List<TContOrg> selectByExample(TContOrgExample example);

    TContOrg selectByPrimaryKey(@Param("contNo") Long contNo, @Param("orgNo") Long orgNo);

    int updateByExampleSelective(@Param("row") TContOrg row, @Param("example") TContOrgExample example);

    int updateByExample(@Param("row") TContOrg row, @Param("example") TContOrgExample example);

    int updateByPrimaryKeySelective(TContOrg row);

    int updateByPrimaryKey(TContOrg row);
}