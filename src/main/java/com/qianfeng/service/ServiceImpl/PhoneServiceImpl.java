package com.qianfeng.service.ServiceImpl;

import com.qianfeng.bean.TbBrand;
import com.qianfeng.bean.TbPhone;
import com.qianfeng.dao.DaoImpl.PhoneDaoImpl;
import com.qianfeng.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PhoneServiceImpl implements PhoneService {
    @Autowired
    private PhoneDaoImpl brandDao;
    @Override
    public List<TbBrand> queryAllBrand() {
        return brandDao.queryAllBrand();
    }

    @Override
    public List<TbPhone> queryPhonesByBrandId(Integer brandId) {
        return brandDao.queryPhonesByBrandId(brandId);
    }

    @Override
    public TbPhone queryPhoneById(Integer phoneId) {
        return brandDao.queryPhoneById(phoneId);
    }
}
