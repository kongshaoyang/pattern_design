package com.kdl.pattern.adapter;

/**
 * @Author:少阳
 * @Date:2019/4/17
 */
public class ResultMsg {
    private int code;
    private String message;
    private Object data;
    private static final int SUCCESS_CODE = 200;
    private static final int ERROR_CODE = 500;

    public ResultMsg(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static ResultMsg loginSuccess(){
        return new ResultMsg(SUCCESS_CODE, "登陆成功",null);
    }


    public static ResultMsg loginSuccess(String key){
        return new ResultMsg(SUCCESS_CODE, "使用"+key+"登陆成功",null);
    }



    public static ResultMsg loginError(){
        return new ResultMsg(ERROR_CODE, "登陆失败",null);
    }

}
