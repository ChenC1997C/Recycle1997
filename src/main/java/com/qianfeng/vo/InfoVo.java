package com.qianfeng.vo;


import com.qianfeng.po.TypePo;

import java.util.List;

public class InfoVo {
    private long phoneId;
    private String phoneName;
    private String phoneImg;
    private long phonePrice;
    private List<TypePo> typePos;

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


    public List<TypePo> getTypePos() {
        return typePos;
    }

    public void setTypePos(List<TypePo> typePos) {
        this.typePos = typePos;
    }
}
