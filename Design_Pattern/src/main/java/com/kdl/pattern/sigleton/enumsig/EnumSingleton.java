package com.kdl.pattern.sigleton.enumsig;


/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public enum  EnumSingleton{
    INSTANCE;
    private Object data;
    public Object getData() {
        return data;
    }
    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
