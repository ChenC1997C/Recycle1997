package com.qianfeng.vo;

import com.qianfeng.po.DamagePO;

import java.util.List;

public class PriceVo {
    private  Long phoneId;
    private String phoneName;
    private  Long phonePrice;
    private String phoneImg;
    private List<Integer> StrDamage_id;
    private List<String> damageInfo;

    public List<String> getDamageInfo() {
        return damageInfo;
    }

    public void setDamageInfo(List<String> damageInfo) {
        this.damageInfo = damageInfo;
    }

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Long getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(Long phonePrice) {
        this.phonePrice = phonePrice;
    }

    public String getPhoneImg() {
        return phoneImg;
    }

    public void setPhoneImg(String phoneImg) {
        this.phoneImg = phoneImg;
    }

    public List<Integer> getStrDamage_id() {
        return StrDamage_id;
    }

    public void setStrDamage_id(List<Integer> strDamage_id) {
        StrDamage_id = strDamage_id;
    }
}
