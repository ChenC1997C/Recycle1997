package com.qianfeng.vo;
//用来存储查找全部手机的类
public class PhonesAndCountVo {
    private long phoneId;
    private String phoneName;
    private String phoneImg;
    private long phonePrice;
    private Integer count;

    public long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(long phoneId) {
        this.phoneId = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public String getPhoneImg() {
        return phoneImg;
    }

    public void setPhoneImg(String phoneImg) {
        this.phoneImg = phoneImg;
    }

    public long getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(long phonePrice) {
        this.phonePrice = phonePrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }


}
