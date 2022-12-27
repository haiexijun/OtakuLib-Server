package com.otakulib.otakulibserver.controller;

import com.otakulib.otakulibserver.common.ApiRestResponse;
import com.otakulib.otakulibserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户相关接口
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //用户注册接口
    @GetMapping("/test")
    public ApiRestResponse test(){
        return ApiRestResponse.success("成功");
    }

}
