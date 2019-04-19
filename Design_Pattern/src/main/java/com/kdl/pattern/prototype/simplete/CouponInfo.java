package com.kdl.pattern.prototype.simplete;

import java.util.List;

/**
 * @Author:少阳
 * @Date:2019/4/11
 */
public class CouponInfo implements Prototype{
    private String name;
    private Integer type;
    private List storeName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List getStoreName() {
        return storeName;
    }

    public void setStoreName(List storeName) {
        this.storeName = storeName;
    }

    @Override
    public Prototype clone() {
        CouponInfo couponInfo = new CouponInfo();
        couponInfo.setName(this.name);
        couponInfo.setStoreName(this.storeName);
        couponInfo.setType(this.type);
        return couponInfo;
    }

    @Override
    public String toString() {
        return "CouponInfo{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", storeName=" + storeName +
                '}';
    }
}
