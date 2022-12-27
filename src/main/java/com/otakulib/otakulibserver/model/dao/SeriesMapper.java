package com.otakulib.otakulibserver.model.dao;

import com.otakulib.otakulibserver.model.pojo.Series;
import org.springframework.stereotype.Repository;

@Repository
public interface SeriesMapper {
    int deleteByPrimaryKey(String id);

    int insert(Series row);

    int insertSelective(Series row);

    Series selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Series row);

    int updateByPrimaryKey(Series row);
}