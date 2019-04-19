package com.kdl.pattern.prototype.simplete;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class Test {
    public static void main(String[] args) {
        CouponInfo couponInfo = new CouponInfo();
        couponInfo.setName("5元代金券");
        couponInfo.setType(1);
        List storeNameList = new ArrayList();
        storeNameList.add("苏果");
        storeNameList.add("华联");
        couponInfo.setStoreName(storeNameList);
        Client client = new Client();
        CouponInfo prototype =  (CouponInfo) client.startCopy(couponInfo);
        System.out.println(couponInfo.toString());
        System.out.println(prototype.toString());
    }
}
