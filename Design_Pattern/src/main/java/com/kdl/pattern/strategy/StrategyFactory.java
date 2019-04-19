package com.kdl.pattern.strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class StrategyFactory {
    private StrategyFactory(){}
    private final static Map<String,Payment> map = new HashMap<>();
    static {
        map.put("ali",new AliPay());
        map.put("weichat",new WeiChatPay());
    }
    public static Payment getInstance(String keyMap){
        if(!map.containsKey(keyMap)){
            return map.get("ali");
        }
        return map.get(keyMap);
    }
}
