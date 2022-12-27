package com.otakulib.otakulibserver.exception;

/**
 * 描述：  统一异常描述类
 */
public class OtakuLibException extends Exception{

    private final Integer code;
    private final String message;

    public OtakuLibException(Integer code,String message){
        this.code = code;
        this.message = message;
    }

    public OtakuLibException(OtakuLibExceptionEnum exceptionEnum){
        this(exceptionEnum.code, exceptionEnum.msg);
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

}
