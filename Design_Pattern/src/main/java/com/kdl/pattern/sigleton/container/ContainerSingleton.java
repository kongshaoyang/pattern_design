package com.kdl.pattern.sigleton.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class ContainerSingleton {
    private ContainerSingleton(){}
    private static Map<String,Object> map = new ConcurrentHashMap<String,Object>();
    public static Object getInstance(String className){
        synchronized (map) {
            if (!map.containsKey(className)) {
                Object obj = null;
                try {
                    obj = Class.forName(className).newInstance();
                    map.put(className, obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return obj;
            } else {
                return map.get(className);
            }
        }
    }

}
