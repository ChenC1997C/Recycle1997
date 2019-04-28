package com.qianfeng.service;


import java.util.List;

public interface PriceService {
    List<Integer> queryDiscounts(List<Integer> list);
    Integer querySumDiscounts (List<Integer> list);
    List<String> queryDamageTypes(List<Integer> list);
}
