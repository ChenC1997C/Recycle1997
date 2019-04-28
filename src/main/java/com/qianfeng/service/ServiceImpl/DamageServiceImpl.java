package com.qianfeng.service.ServiceImpl;

import com.qianfeng.dao.DaoImpl.DamageDAOImpl;
import com.qianfeng.po.TypePo;
import com.qianfeng.service.DamageService;
import com.qianfeng.vo.InfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DamageServiceImpl implements DamageService {
    @Autowired
    private DamageDAOImpl damageDAO;
    @Override
    public InfoVo queryPhoneInfo(Integer phoneId,Integer pageId) {
        InfoVo infoVo=damageDAO.queryPhoneInfo(phoneId);
        List<TypePo> typePos = new ArrayList<>();
        if(pageId==1){
            for(TypePo typePo:infoVo.getTypePos()){
                if(typePo.getTypeId()<7){
                    typePos.add(typePo);
                }
            }
            infoVo.setTypePos(typePos);
        }else if(pageId==2){
            for(TypePo typePo:infoVo.getTypePos()){
                if(typePo.getTypeId()==7){
                    typePos.add(typePo);
                }
            }
            infoVo.setTypePos(typePos);
        }else if(pageId==3){
            for(TypePo typePo:infoVo.getTypePos()){
                if(typePo.getTypeId()>7){
                    typePos.add(typePo);
                }
            }
            infoVo.setTypePos(typePos);
        }else{
            throw new NullPointerException("页面参数异常");
        }

        return infoVo;
    }

    @Override
    public List<TypePo> queryTypeInfo(Integer phoneId, Integer pageId) {
        List<TypePo> typePos = damageDAO.queryTypeInfo(phoneId);
        List<TypePo> newTypePos = new ArrayList<>();
        if(pageId==1){
            for(TypePo t:typePos){
                if(t.getTypeId()<6){
                    newTypePos.add(t);
                }
            }
            return  newTypePos;
        }else if(pageId==2){
            for(TypePo t:typePos){
                if(t.getTypeId()==7){
                    newTypePos.add(t);
                }
            }
            return  newTypePos;
        }else if(pageId==3){
            for(TypePo t:typePos){
                if(t.getTypeId()>7){
                    newTypePos.add(t);
                }
            }
            return  newTypePos;
        }else{
            throw new NullPointerException("页面参数异常");
        }
    }
}
