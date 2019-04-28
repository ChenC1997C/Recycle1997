package com.qianfeng.mapper;


import com.qianfeng.bean.TbBrand;
import com.qianfeng.bean.TbPhone;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface PhoneMapper {
    List<TbBrand> queryAllBrand();      //    查找品牌
    List<TbPhone> queryPhonesByBrandId(@Param("brandId") Integer brandId);  //  通过品牌编号查找手机型号
    TbPhone queryPhoneById(@Param("phoneId") Integer phoneId);
}
