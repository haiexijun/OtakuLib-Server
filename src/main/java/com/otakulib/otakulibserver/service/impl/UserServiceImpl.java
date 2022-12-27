package com.otakulib.otakulibserver.service.impl;

import com.otakulib.otakulibserver.model.dao.UserMapper;
import com.otakulib.otakulibserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;




}
