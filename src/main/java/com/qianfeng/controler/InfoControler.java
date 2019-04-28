package com.qianfeng.controler;

import com.qianfeng.bean.TbPhone;
import com.qianfeng.po.DamagePO;
import com.qianfeng.po.TypePo;
import com.qianfeng.service.ServiceImpl.DamageServiceImpl;
import com.qianfeng.service.ServiceImpl.PhoneServiceImpl;
import com.qianfeng.vo.InfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("info")
public class InfoControler {
    @Autowired
    private DamageServiceImpl damageService;
    @Autowired
    private PhoneServiceImpl phoneService;
    @ResponseBody
    @RequestMapping(value = "{phoneId}/{pageId}",method = RequestMethod.GET)
    public List<TypePo> queryTypeInfo(@PathVariable("phoneId") Integer phoneId ,@PathVariable("pageId") Integer pageId){
        List<TypePo> voList= damageService.queryTypeInfo(phoneId,pageId);
        return voList;
    }

    @ResponseBody
    @RequestMapping(value = "{phoneId}" ,method = RequestMethod.GET)
    public TbPhone queryPhoneById(@PathVariable("phoneId") Integer phoneId){
        return phoneService.queryPhoneById(phoneId);
    }
}
