package com.qianfeng.mapper;

import com.qianfeng.bean.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface UserMapper {
    TbUser queryUser(@Param("userName") String userName);
    void insertUser(TbUser user);
}
