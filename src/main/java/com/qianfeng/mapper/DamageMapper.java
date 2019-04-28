package com.qianfeng.mapper;

import com.qianfeng.po.TypePo;
import com.qianfeng.vo.InfoVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DamageMapper {
    InfoVo queryPhoneInfo(@Param("phoneId") Integer phoneId);
    List<TypePo> queryTypeInfo(@Param("phoneId") Integer phoneId);
}
