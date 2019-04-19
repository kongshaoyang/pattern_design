package com.kdl.pattern.adapter;

/**
 * @Author:少阳
 * @Date:2019/4/17
 */
public class LoginForTelAdapter implements LoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String str, Object loginAdapter) {
        return ResultMsg.loginSuccess(str);
    }
}
