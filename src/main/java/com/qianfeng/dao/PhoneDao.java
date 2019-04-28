package com.qianfeng.dao;

import com.qianfeng.bean.TbBrand;
import com.qianfeng.bean.TbPhone;
import com.qianfeng.vo.PhonesAndCountVo;

import java.util.List;

public interface PhoneDao {
    /**
     * 查找所有手机品牌
     * @return 所有品牌
     */
    List<TbBrand> queryAllBrand();

    /**
     *  通过品牌Id查找所有型号手机
     *  如果id=0 查找所有手机型号
     * @param brandId 品牌ID
     * @return 手机型号
     */
    List<TbPhone> queryPhonesByBrandId(Integer brandId);

    /**
     * 通过Id查手机
     * @param phoneId 手机ID
     * @return 手机
     */
    TbPhone queryPhoneById(Integer phoneId);
}
