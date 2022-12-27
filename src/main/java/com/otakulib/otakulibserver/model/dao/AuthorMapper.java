package com.otakulib.otakulibserver.model.dao;

import com.otakulib.otakulibserver.model.pojo.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorMapper {
    int deleteByPrimaryKey(String id);

    int insert(Author row);

    int insertSelective(Author row);

    Author selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Author row);

    int updateByPrimaryKey(Author row);
}