package com.qianfeng.dao;


import com.qianfeng.po.TypePo;
import com.qianfeng.vo.InfoVo;

import java.util.List;

public interface DamageDao {
    /**
     * 通过手机Id 查找手机基本信息和所有损伤信息
     * @param phoneId 手机ID
     * @return
     */
    InfoVo queryPhoneInfo(Integer phoneId);

    /**
     * 通过手机id 查找手机所有损伤信息
     * @param phoneId
     * @return
     */
    List<TypePo> queryTypeInfo(Integer phoneId);
}
