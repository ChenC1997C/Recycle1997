package com.qianfeng.controler;

import com.qianfeng.bean.TbPhone;
import com.qianfeng.bean.TbUser;
import com.qianfeng.service.ServiceImpl.PhoneServiceImpl;
import com.qianfeng.service.ServiceImpl.PriceServiceImpl;
import com.qianfeng.vo.PriceVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("price")
public class PriceControler {

    @Autowired
    private PriceServiceImpl priceService;
    @Autowired
    private PhoneServiceImpl phoneService;
    private HashMap<Long, PriceVo> map=new HashMap<>();
    @RequestMapping(value = "{str}",method = RequestMethod.POST)
    public String queryDiscounts(@PathVariable("str") String str, HttpSession session){
        //页面传来的字符串截取 转换成Integer类型的集合，查找所有集合里有的损伤id 的损伤率总和
        String strs=str.replace(",0","");
        String[] arr=strs.split(",");
        String url;
        int phoneId=Integer.parseInt(arr[arr.length-1]);
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length-2;i++){
            list.add(Integer.parseInt(arr[i]));
        }
        Integer disPrice=priceService.querySumDiscounts(list);
        TbPhone phone=phoneService.queryPhoneById(phoneId);
        PriceVo priceVo=new PriceVo();
        priceVo.setPhoneId(phone.getPhoneId());
        priceVo.setPhoneImg(phone.getPhoneImg());
        priceVo.setPhoneName(phone.getPhoneName());
        priceVo.setPhonePrice(phone.getPhonePrice()-disPrice);
        priceVo.setStrDamage_id(list);
        TbUser user= (TbUser) session.getAttribute("user");
        if(user==null){
            map.put(phone.getPhoneId(),priceVo);
             url="price.html?MyKey="+phone.getPhoneId();

        }else{
            map.put(user.getUserId(),priceVo);
            url="price.html?MyKey="+user.getUserId();
        }
        return url;
    }
    @ResponseBody
    @RequestMapping(value = "show/{key}",method = RequestMethod.GET)
    public PriceVo getPriceVo(@PathVariable("key")Long key){
        PriceVo priceVo=map.get(key);
        return priceVo;
    }
    @ResponseBody
    @RequestMapping(value = "check" ,method = RequestMethod.GET)
    public Integer checkUser(HttpSession session){
        TbUser user= (TbUser) session.getAttribute("user");
        if(user==null){
            return 0;
        }
        return 1;
    }
    @ResponseBody
    @RequestMapping(value = "cart" ,method = RequestMethod.GET)
    public PriceVo getPriceVo(HttpSession session){
        TbUser user= (TbUser) session.getAttribute("user");
        PriceVo priceVo=map.get(user.getUserId());
        priceVo.setDamageInfo(priceService.queryDamageTypes(priceVo.getStrDamage_id()));
        return priceVo;
    }
    public String insertOrder(){

        return  "ok";
    }
}
