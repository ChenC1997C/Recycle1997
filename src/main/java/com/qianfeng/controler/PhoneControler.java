package com.qianfeng.controler;


import com.qianfeng.bean.TbBrand;
import com.qianfeng.bean.TbPhone;
import com.qianfeng.service.ServiceImpl.PhoneServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("phone")
public class PhoneControler {
    @Autowired
    private PhoneServiceImpl brandService;

    @ResponseBody
    @RequestMapping(value = "brand",method = RequestMethod.GET)
    public List<TbBrand> queryAllBrand(){
        return brandService.queryAllBrand();
    }

    @ResponseBody
    @RequestMapping(value = "{brandId}" ,method = RequestMethod.GET)
    public List<TbPhone> queryPhonesByBrandId(@PathVariable("brandId") Integer brandId){
        List<TbPhone> phones=brandService.queryPhonesByBrandId(brandId);
        for(TbPhone phone:phones){
            System.out.println(phone.getPhoneName());
        }
        return phones;
    }

}
