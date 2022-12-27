package com.otakulib.otakulibserver.model.dao;

import com.otakulib.otakulibserver.model.pojo.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookMapper {
    int deleteByPrimaryKey(String id);

    int insert(Book row);

    int insertSelective(Book row);

    Book selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Book row);

    int updateByPrimaryKey(Book row);
}