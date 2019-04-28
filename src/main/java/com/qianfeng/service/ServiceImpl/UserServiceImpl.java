package com.qianfeng.service.ServiceImpl;

import com.qianfeng.bean.TbUser;
import com.qianfeng.mapper.UserMapper;
import com.qianfeng.service.UserService;
import com.qianfeng.utils.MD5Utils;
import com.qianfeng.vo.LoginInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public String login(LoginInfoVO loginInfoVO, HttpSession session)  {
        if (loginInfoVO == null) {
            return "null";
        }
        String username = loginInfoVO.getUserName();
        String password = loginInfoVO.getUserPassword();

        System.out.println(username);
        System.out.println(password);
        if (null == username || "".equals(username)) {
            return "failed";
        }

        TbUser tbUser = userMapper.queryUser(username);
        if (tbUser == null) {
            return "unknown";
        }

        String md5Password = MD5Utils.md5(password, "salt");
        if (!md5Password.equals(tbUser.getPassword())){
            return  "mistake";
        }
        session.setAttribute("user",tbUser);
        return "ok";

    }

    @Override
    public String register(LoginInfoVO loginInfoVO) {

        TbUser user=userMapper.queryUser(loginInfoVO.getUserName());
        if(user!=null){
            return "failed";
        }else {
            TbUser tbUser=new TbUser();
            tbUser.setEMail(null);
            tbUser.setAccount(0);
            tbUser.setFrozen(0);
            tbUser.setLevel(2);
            tbUser.setPic(null);
            tbUser.setUserTel(null);
            tbUser.setUserName(loginInfoVO.getUserName());
            tbUser.setPassword(MD5Utils.md5(loginInfoVO.getUserPassword(),"salt"));
            try{
                userMapper.insertUser(tbUser);
            }catch (Exception e){
                e.printStackTrace();
            }
            return "ok";
        }

    }
}
