package com.qianfeng.service;

import com.qianfeng.po.TypePo;
import com.qianfeng.vo.InfoVo;

import java.util.List;

public interface DamageService {
    InfoVo queryPhoneInfo(Integer phoneId,Integer pageId);
    List<TypePo> queryTypeInfo(Integer phoneId, Integer pageId);
}
