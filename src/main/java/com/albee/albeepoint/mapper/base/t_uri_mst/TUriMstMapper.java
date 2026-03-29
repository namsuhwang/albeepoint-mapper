package com.albee.albeepoint.mapper.base.t_uri_mst;

import com.albee.albeepoint.mapper.base.t_uri_mst.TUriMst;
import com.albee.albeepoint.mapper.base.t_uri_mst.TUriMstExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUriMstMapper {
    long countByExample(TUriMstExample example);

    int deleteByExample(TUriMstExample example);

    int deleteByPrimaryKey(@Param("uri") String uri, @Param("trGbCd") String trGbCd);

    int insert(TUriMst row);

    int insertSelective(TUriMst row);

    List<TUriMst> selectByExample(TUriMstExample example);

    TUriMst selectByPrimaryKey(@Param("uri") String uri, @Param("trGbCd") String trGbCd);

    int updateByExampleSelective(@Param("row") TUriMst row, @Param("example") TUriMstExample example);

    int updateByExample(@Param("row") TUriMst row, @Param("example") TUriMstExample example);

    int updateByPrimaryKeySelective(TUriMst row);

    int updateByPrimaryKey(TUriMst row);
}