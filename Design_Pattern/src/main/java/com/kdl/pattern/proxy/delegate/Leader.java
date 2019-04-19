package com.kdl.pattern.proxy.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author:少阳
 * @Date:2019/4/16
 */
public class Leader implements IEmployee{
    private Map<String,IEmployee> map = new HashMap<>();
    public Leader(){
        map.put("加密",new EmployeeA());
        map.put("架构",new EmployeeB());
    }

    @Override
    public void doing(String command) {
        map.get(command).doing(command);
    }

}
