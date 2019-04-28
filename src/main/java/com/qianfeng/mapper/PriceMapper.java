package com.qianfeng.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PriceMapper {
    List<Integer>  queryDiscounts(List<Integer> list);
    Integer querySumDiscounts (List<Integer> list);
    List<String> queryDamageTypes(List<Integer> list);
}
