package com.qianfeng.po;

import java.util.List;

public class TypePo {

    private  Integer typeId;
    private String typeName;
    List<DamagePO> damagePOS;

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<DamagePO> getDamagePOS() {
        return damagePOS;
    }

    public void setDamagePOS(List<DamagePO> damagePOS) {
        this.damagePOS = damagePOS;
    }


}
