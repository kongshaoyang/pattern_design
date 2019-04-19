package com.kdl.pattern.adapter;

/**
 * @Author:少阳
 * @Date:2019/4/17
 */
public class PassportForThirdAdapter implements IPassportForThird{
    @Override
    public ResultMsg loginForQQ(String qq){
        return processLogin(qq,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForTel(String phone){
        return processLogin(phone,LoginForQQAdapter.class);
    }


    private ResultMsg processLogin(String str,Class<? extends LoginAdapter> clazz){
        try {
            LoginAdapter adapter = clazz.newInstance();
            if(adapter.support(adapter)){
                return adapter.login(str,adapter);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
