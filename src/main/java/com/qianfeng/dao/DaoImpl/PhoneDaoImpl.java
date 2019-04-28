package com.qianfeng.dao.DaoImpl;

import com.qianfeng.bean.TbBrand;
import com.qianfeng.bean.TbPhone;
import com.qianfeng.dao.PhoneDao;
import com.qianfeng.mapper.PhoneMapper;
import com.qianfeng.vo.PhonesAndCountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class PhoneDaoImpl implements PhoneDao {
    @Autowired
    private PhoneMapper phoneMapper;

    @Override
    public List<TbBrand> queryAllBrand() {
        return phoneMapper.queryAllBrand();
    }

    @Override
    public List<TbPhone> queryPhonesByBrandId(Integer brandId) {
        return phoneMapper.queryPhonesByBrandId(brandId);
    }

    @Override
    public TbPhone queryPhoneById(Integer phoneId) {
        return  phoneMapper.queryPhoneById(phoneId);
    }


}
