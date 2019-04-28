package com.qianfeng.dao.DaoImpl;

import com.qianfeng.dao.PriceDao;
import com.qianfeng.mapper.PriceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PriceDaoImpl  implements PriceDao {
    @Autowired
    private PriceMapper priceMapper;
    @Override
    public List<Integer>  queryDiscounts(List<Integer> list) {
        return priceMapper.queryDiscounts(list);
    }

    @Override
    public Integer querySumDiscounts(List<Integer> list) {
        return priceMapper.querySumDiscounts(list);
    }

    @Override
    public List<String> queryDamageTypes(List<Integer> list) {
        return priceMapper.queryDamageTypes(list);
    }
}
