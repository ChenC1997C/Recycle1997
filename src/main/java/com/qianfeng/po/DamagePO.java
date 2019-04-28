package com.qianfeng.po;

public class DamagePO {
    private long damageId;
    private String damageInfo;
    private String infoDescribe;
    private double discountRate;

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public long getDamageId() {
        return damageId;
    }

    public void setDamageId(long damageId) {
        this.damageId = damageId;
    }

    public String getDamageInfo() {
        return damageInfo;
    }

    public void setDamageInfo(String damageInfo) {
        this.damageInfo = damageInfo;
    }

    public String getInfoDescribe() {
        return infoDescribe;
    }

    public void setInfoDescribe(String infoDescribe) {
        this.infoDescribe = infoDescribe;
    }
}
