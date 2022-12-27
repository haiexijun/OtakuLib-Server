package com.otakulib.otakulibserver.controller;

import com.otakulib.otakulibserver.common.ApiRestResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @GetMapping("/test")
    public String test(){
        return "测试成功";
    }

    @GetMapping("/test2")
    public ApiRestResponse testAPI(){
        return ApiRestResponse.success();
    }

}
