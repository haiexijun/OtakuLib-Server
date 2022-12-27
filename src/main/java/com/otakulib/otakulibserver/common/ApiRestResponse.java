package com.otakulib.otakulibserver.common;


import com.otakulib.otakulibserver.exception.OtakuLibExceptionEnum;

/**
 * 描述：API通用返回对象
 */
public class ApiRestResponse<T> {

    // 状态码
    private Integer status;

    // 响应信息
    private String msg;

    // 响应的数据data
    private T data;

    //响应成功为10000。这个状态数是我们自己定义的。
    private static final int OK_CODE =10000;
    private static final String OK_MSG="SUCCESS";

    public ApiRestResponse() {
        //无参构造方法为默认的响应信息
        this(OK_CODE,OK_MSG);
    }

    public ApiRestResponse(Integer status, String msg, T data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public ApiRestResponse(Integer status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    // 为了方便调试，打印出来，故重写toString方法
    @Override
    public String toString() {
        return "ApiRestResponse{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    //请求成功时调用，无返回结果
    public static <T> ApiRestResponse<T> success(){
        //成功就调用无参的构造方法就行
        return new ApiRestResponse<T>();
    }

    // 请求成功调用的重载，有返回结果
    public static <T> ApiRestResponse<T> success(T result){
        ApiRestResponse<T> response=new ApiRestResponse<T>();
        response.setData(result);
        return response;
    }

    public static <T> ApiRestResponse<T> error(OtakuLibExceptionEnum ex){
        return new ApiRestResponse<T>(ex.getCode(), ex.getMsg());
    }

    public static <T> ApiRestResponse<T> error(Integer code,String msg){
        return new ApiRestResponse<T>(code,msg);
    }
}
