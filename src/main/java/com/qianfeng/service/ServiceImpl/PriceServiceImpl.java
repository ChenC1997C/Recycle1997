package com.qianfeng.service.ServiceImpl;

import com.qianfeng.dao.DaoImpl.PriceDaoImpl;
import com.qianfeng.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceDaoImpl priceDao;
    @Override
    public List<Integer> queryDiscounts(List<Integer> list) {
        return priceDao.queryDiscounts(list);
    }

    @Override
    public Integer querySumDiscounts(List<Integer> list) {
        return priceDao.querySumDiscounts(list);
    }

    @Override
    public List<String> queryDamageTypes(List<Integer> list) {
        return priceDao.queryDamageTypes(list);
    }
}
