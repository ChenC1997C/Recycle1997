package com.qianfeng.service;

import com.qianfeng.bean.TbBrand;
import com.qianfeng.bean.TbPhone;

import java.util.List;

public interface PhoneService {

    List<TbBrand> queryAllBrand();

    List<TbPhone> queryPhonesByBrandId(Integer brandId);

    TbPhone queryPhoneById(Integer phoneId);
}
