package com.qianfeng.dao;

import java.util.List;

public interface PriceDao {
    List<Integer> queryDiscounts(List<Integer> list);
    Integer querySumDiscounts (List<Integer> list);
    List<String> queryDamageTypes(List<Integer> list);
}
