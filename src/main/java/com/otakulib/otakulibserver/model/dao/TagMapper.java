package com.otakulib.otakulibserver.model.dao;

import com.otakulib.otakulibserver.model.pojo.Tag;
import org.springframework.stereotype.Repository;

@Repository
public interface TagMapper {
    int deleteByPrimaryKey(String id);

    int insert(Tag row);

    int insertSelective(Tag row);

    Tag selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Tag row);

    int updateByPrimaryKey(Tag row);
}