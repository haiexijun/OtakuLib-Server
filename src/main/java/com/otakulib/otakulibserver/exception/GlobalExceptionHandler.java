package com.otakulib.otakulibserver.exception;

import com.otakulib.otakulibserver.common.ApiRestResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 描述 ： 用于统一处理异常的类
 */
//@ControllerAdvice的作用就是拦截异常的
@ControllerAdvice
public class GlobalExceptionHandler {

    private final Logger log= LoggerFactory.getLogger(GlobalExceptionHandler.class);

    //系统错误的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Object handleException(Exception e){
        log.error("Default Exception : " +e);
        return ApiRestResponse.error(OtakuLibExceptionEnum.SYSTEM_ERROR);
    }

    //处理自定义的异常
    @ExceptionHandler(OtakuLibException.class)
    @ResponseBody
    public Object MallException(OtakuLibException e){
        log.error("MallException : " +e);
        return ApiRestResponse.error(e.getCode(),e.getMessage());
    }


}
