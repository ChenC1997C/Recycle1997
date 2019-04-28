package com.qianfeng.dao.DaoImpl;

import com.qianfeng.dao.DamageDao;
import com.qianfeng.mapper.DamageMapper;
import com.qianfeng.po.TypePo;
import com.qianfeng.vo.InfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DamageDAOImpl implements DamageDao {
    @Autowired
    private DamageMapper damageMapper;
    @Override
    public InfoVo queryPhoneInfo(Integer phoneId) {
        return damageMapper.queryPhoneInfo(phoneId);
    }

    @Override
    public List<TypePo> queryTypeInfo(Integer phoneId) {
        return damageMapper.queryTypeInfo(phoneId);
    }
}
