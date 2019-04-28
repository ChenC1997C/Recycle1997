package com.qianfeng;

import com.qianfeng.bean.TbBrand;
import com.qianfeng.bean.TbPhone;
import com.qianfeng.bean.TbUser;
import com.qianfeng.mapper.DamageMapper;
import com.qianfeng.mapper.PriceMapper;
import com.qianfeng.mapper.UserMapper;
import com.qianfeng.po.DamagePO;
import com.qianfeng.po.TypePo;
import com.qianfeng.service.ServiceImpl.DamageServiceImpl;
import com.qianfeng.service.ServiceImpl.PhoneServiceImpl;
import com.qianfeng.service.ServiceImpl.PriceServiceImpl;
import com.qianfeng.service.ServiceImpl.UserServiceImpl;
import com.qianfeng.vo.InfoVo;
import com.qianfeng.vo.LoginInfoVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class SpringTest {
    @Autowired
    private PhoneServiceImpl brandService;
    @Autowired
    private DamageServiceImpl damageService;
    @Autowired
     private PriceServiceImpl priceService;
    @Autowired
    private UserServiceImpl userService;
    @Autowired
    private UserMapper userMapper;
    @Test
    public void test1(){
        List<TbBrand> list=brandService.queryAllBrand();
        for(TbBrand tbBrand:list){
            System.out.println(tbBrand.getBrandId()+"-----"+tbBrand.getBrandName());
        }
    }
    @Test
    public void test2(){
        List<TbPhone> list=brandService.queryPhonesByBrandId(2);
        for(TbPhone tbBrand:list){
            System.out.println(tbBrand.getBrandId()+"-----"+tbBrand.getPhoneId()+"-------"+tbBrand.getPhoneName());
        }
    }
    @Test
    public void test3(){
        InfoVo infoVo=damageService.queryPhoneInfo(1,2);
        List<TypePo> typePos=infoVo.getTypePos();
        for(TypePo a:typePos){
            System.out.println(a.getTypeName());
            for(DamagePO b:a.getDamagePOS()){
                System.out.println(b.getDamageInfo());
                System.out.println(b.getDiscountRate());
            }
        }
    }
    @Test
    public void test4(){
//        userService.register("123","123");
        LoginInfoVO loginInfoVO=new LoginInfoVO();
        loginInfoVO.setUserName("chen");
        loginInfoVO.setUserPassword("1997531");
        TbUser user=userMapper.queryUser("chen");
        System.out.println(user.getPassword());
    }

}
